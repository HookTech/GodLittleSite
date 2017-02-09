package com.unionpay.core.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoader;

/**
 * @see 示例restful：$Home/file/download?file_name=
 * */
@Controller
@RequestMapping("file")
public class FileController extends CommonController{
	@RequestMapping(value="download", method=RequestMethod.GET)
	public ResponseEntity<byte[]> download(@RequestParam("file_name") String fileName){
		String dfileName = "";
		try {
			dfileName = new String(fileName.getBytes("utf8"),"ISO8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO 二期控制错误
			e.printStackTrace();
		}
		// TODO 奇怪的问题，在调用getServletContext时会报错，后面在maven中加入servlet依赖可以，但是应该重复了，Apache tomcat 7类库中应该有该接口
		String path = ContextLoader.getCurrentWebApplicationContext().getServletContext().getRealPath("/") + "file/download/"+fileName;
//		path = ContextLoader.getCurrentWebApplicationContext().getServletContext().getContextPath(); 相对路径
		File f = new File(path);
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		header.setContentDispositionFormData("attachment",dfileName);
		//InputStream in = new BufferedInputStream(new FileInputStream(f));
		byte[] out = new byte[1];
		try {
			out = FileCopyUtils.copyToByteArray(f);
		} catch (IOException e) {
			// TODO 二期控制错误
			e.printStackTrace();
		}
//		header.setContentLength((long)out.length);
		return new ResponseEntity<byte[]>(out,header,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="stream",method=RequestMethod.GET)
	public ResponseEntity<byte[]> stream(@RequestParam("file_name") String fileName){
		String dfileName = "";
		try{
			dfileName = new String(fileName.getBytes("utf8"),"ISO8859-1");
		} catch(UnsupportedEncodingException e){
			// TODO 二期控制错误
			e.printStackTrace();
		}
		String path = ContextLoader.getCurrentWebApplicationContext().getServletContext().getRealPath("/") + "file/stream/"+fileName;
		File f = new File(path);
		HttpHeaders header = new HttpHeaders();
		header.setContentType(new MediaType("audio","mp3"));
		byte[] out = new byte[1];
		try {
			out = FileCopyUtils.copyToByteArray(f);
		} catch (IOException e) {
			// TODO 二期控制错误
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(out,header,HttpStatus.OK);
	}
}
