package kr.green.spring.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class UploadFileUtils {
	/* 기능 : 파일주소와 파일명과 파일이 주어지면 해당 파일 주소에 업로드일을 기준으로 년/월/일 폴도를 만들어 해당 폴더에 파일을 업로드 하는 메소드
	 * 매개변수 : uploadpath,: 업로드 할 파일 경로
	 * 			originalName : 실제 파일명
	 * 			fileDate : 업로드 할 실제  파일 데이터가 있는 배열
	 * 리턴타입 : 저장된 파일결오와 파일명으로 된 문자열
	 * 예시 : uploadPath = "D:\\java_shg\\uploadfiles", originalName = "dog.jpg"
	 * 		fileData에는 dog.jpg 파일이 배열로 담겨있다고 생각하면 됨
	 * */	
	public static String uploadFile(String uploadPath, String originalName, byte[] fileData)throws Exception{
		// UUID 생성 => 550e8400-e29b-41d4-a716-446655440000
		UUID uid = UUID.randomUUID();
		// 파일명에 UUID를 붙여줌 => 550e8400-e29b-41d4-a716-446655440000_dog.jpg
		String savedName = uid.toString() +"_" + originalName;
		// 
		String savedPath = calcPath(uploadPath);
		File target = new File(uploadPath + savedPath, savedName);
		FileCopyUtils.copy(fileData, target);
		String uploadFileName = makeIcon(savedPath, savedName);
		return uploadFileName;
	}
	/* 기능 : 업로드 할 파일 경로를 알려주면 해당 파일 경로에 오늘 날짜에 해당하는 폴더가 있는지 확인하여 없으면 폴더를 생성하고, 날짜 폴더 경로를 알려주는 메소드
	 * 매개변수 : uploadpath - 업로드 할 파일의 경로
	 * 리턴타입 : 날짜 폴더 경로 -> 2021\\07\\14
	 * */
	private static String calcPath(String uploadPath) {
		// 실행되는 시간을 기준으로 달력 정보를 가져옴
		Calendar cal = Calendar.getInstance();
		// \\2021 
		String yearPath = File.separator+cal.get(Calendar.YEAR);
		// \\2021\\07
		String monthPath = yearPath + File.separator 
            + new DecimalFormat("00").format(cal.get(Calendar.MONTH)+1);
		// \\2021\\07\\14
		String datePath = monthPath + File.separator 
            + new DecimalFormat("00").format(cal.get(Calendar.DATE));
		// 
		makeDir(uploadPath, yearPath, monthPath, datePath);
		
		return datePath; 
	} 
	/* 기능 : 업로드 경로, 폴더들이 주어지면 업로드 경로에 폴더들이 있는지 확인하고 없으면 해당 폴더들을 생성하는 메소드
	 * 매개변수 : uploadPath : 업로드 경로, paths : 폴더들
	 * 리턴타입 : 없음
	 * */ 
	private static void makeDir(String uploadPath, String... paths) {
		// D:\\java_shg\\uploadfiles\\2021\\07\\14 
		// 년월일로 된 폴더가 이미 있으면 메소드 종료
		if(new File(uploadPath + paths[paths.length-1]).exists())
			return;
		for(String path : paths) {
			// D:\\java_shg\\uploadfiles\\2021\\07\\14
			File dirPath = new File(uploadPath + path);
			// 폴더가 없으면 해당 폴더를 생성
			if( !dirPath.exists())
				dirPath.mkdir();
		}
	}
	
	/* 기능 : 날짜 폴더 경로와 파일명이 주어지면 합쳐서 하나의 문자열로 반환하는 메소드
	 * 		단, 경로에 \\ 대신 / 로 가져옴 
	 * 매개변수 : uploadPath, path, fileName 
	 * 리턴타입 : 
	 * */
	private static String makeIcon(String path, String fileName)
        	throws Exception{
		// \\2021\\07\\14 + \\ + 550e8400-e29b-41d4-a716-446655440000_dog.jpg => \\2021\\07\\14\\550e8400-e29b-41d4-a716-446655440000_dog.jpg
		String iconName = path + File.separator + fileName;
		//  /2021/07/14/550e8400-e29b-41d4-a716-446655440000_dog.jpg
		return iconName.replace(File.separatorChar, '/');
	}
}