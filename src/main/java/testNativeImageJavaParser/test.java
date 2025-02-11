package testNativeImageJavaParser;

import java.io.File;
import java.io.FileNotFoundException;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

public class test {

	public static void main(String args[]) throws FileNotFoundException
	{
		System.err.println("A1");
		CompilationUnit cu = StaticJavaParser.parse(new File("testDatas\\Vertex2D.java"));
		System.err.println("A2 - show class");
		
		cu.findAll(ClassOrInterfaceDeclaration.class).forEach(cls -> {
			System.err.println(">> "+cls);
		});
		System.err.println("A3");
	}
}
