package org.practice.Annotations;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.NotDirectoryException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

public class InfoProcessHelper {
	public static ClassLoader[] getAllClassLoaderInAppContext() {

		Set<Thread> group = Thread.getAllStackTraces().keySet();
		ThreadGroup tg = Thread.currentThread().getThreadGroup();
		return null;

	}

	public static Class[] getAllClasses(String aPackageName) throws ClassNotFoundException, IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader == null) {
			throw new ClassNotFoundException(aPackageName);
		}
		String path = aPackageName.replace('.', '/');
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = (URL) resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		ArrayList<Class> classes = new ArrayList<Class>();
		for (File dir : dirs) {
			classes.addAll(findClasses(dir, aPackageName));
		}
		return classes.toArray(new Class[classes.size()]);
	}

	private static List<Class> findClasses(File dir, String packageName)
			throws NotDirectoryException, ClassNotFoundException {
		List<Class> classes = new ArrayList<Class>();
		if (!dir.exists()) {
			throw new NotDirectoryException("No directory in the path : " + dir);
		}
		File[] files = dir.listFiles();
		for (File aFile : files) {
			if (aFile.isDirectory()) {
				if (aFile.getName().contains(".")) {
					classes.addAll(findClasses(aFile, packageName + "." + aFile.getName()));

				} else {
					throw new NotDirectoryException("No directory in the path : " + aFile.getPath());
				}
			}
			if (aFile.getName().contains(".class")) {
				classes.add(Class.forName(packageName + '.' + aFile.getName().substring(0, aFile.getName().length() - 6)));
			}
		}
		return classes;
	}
}
