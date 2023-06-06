public class RevOneLoop {
		public static void main(String[] args) {
			
			String s1="# # # # # ";
			
			for(int i=1;i<=5;i++) {
				System.out.println(s1);
				s1=s1.replaceFirst("# ", "");
		}	
	}
}
