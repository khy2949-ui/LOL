package exam22;

public class Downloader {
	interface DownloadListener {
		void onComplete(String result);
	}
	
	void starDownload(DownloadListener listener) {
		System.out.println("다운로드를 시작홥니다...");
		try {Thread.sleep(2000);} catch (Exception e) {}
		listener.onComplete("성공한 데이터");
	}

	public static void startDownload(DownloadListener downloadListener) {
		// TODO Auto-generated method stub
		
	}
}
