package my.javatraining.java8;

import java.io.File;
import java.io.FilenameFilter;

public class FileListLambda {
	public static FileListLambda getInstance() {
		return new FileListLambda();
	}

	public String[] showFileListWithFunctionInterfaceImpl() {
		File dicrecotry = new File("./src/my/test");
		return dicrecotry.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}

		});
	}
	public String[] showFileListWithFunctionInterfaceLamdaImpl() {
		File dicrecotry = new File("./src/my/test");
		return dicrecotry.list((dir,name)-> 
				{return name.endsWith(".java");});
	}

	public static void main(String[] args) {
		for (String name : FileListLambda.getInstance().showFileListWithFunctionInterfaceImpl())
			System.out.println(name);

	}
}
