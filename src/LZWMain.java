
public class LZWMain {
	public static void main (String[]args)
	{
		LZWCompression file1 = new LZWCompression("lzw-file1");
		file1.readFile();
		file1.LZWcompress();
		file1.writeFile();
		LZWCompression file2 = new LZWCompression("lzw-file2");
		file2.readFile();
		file2.LZWcompress();
		file2.writeFile();
		LZWCompression file3 = new LZWCompression("lzw-file3");
		file3.readFile();
		file3.LZWcompress();
		file3.writeFile();
	}
}
