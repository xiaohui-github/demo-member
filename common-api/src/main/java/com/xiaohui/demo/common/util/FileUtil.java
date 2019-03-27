/**
 * 项目名称：common-api
 * 包	 名：com.xiaohui.demo.common
 * 文件名称：FileUtil.java
 * 文件路径：com.xiaohui.demo.common.FileUtil.java
 * 版权声明：xiaohui开发，归xiaohui所有
 * 版	 本：V100R001C00
 * 作        者：xiaohui
 * 邮	 箱：xuxiaohuimail@163.com
 * 创建日期：2019年3月27日
 */
package com.xiaohui.demo.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <FileUtil.java>
 *
 * @author xiaohui
 * @Email xuxiaohuimail@163.com
 * @date 2019年3月27日
 * @version V100R001C00
 */
public class FileUtil {
	/**
	 * 迭代查找文件夹中所有文件，返回文件绝对路径
	 * 
	 * method name:iteratorFileInDir
	 *
	 * description:迭代查找文件夹中所有文件，返回文件绝对路径 author:xiaohui 
	 * date:2019年3月27日
	 *
	 * @param dir
	 *            路径
	 * @return
	 */
	public static List<String> iteratorFileInDir(String dir) {
		return iteratorFileInDir(new File(dir));
	}

	/**
	 * 迭代查找文件夹中所有文件，返回文件绝对路径
	 * 
	 * method name:iteratorFileInDir
	 *
	 * description:迭代查找文件夹中所有文件，返回文件绝对路径 author:xiaohui
	 * 
	 * date:2019年3月27日
	 *
	 * @param file
	 *            文件（文件夹）
	 * @return
	 */
	public static List<String> iteratorFileInDir(File file) {
		// 不存在
		if (!file.exists()) {
			return new ArrayList<String>(0);
		}
		// 传入的是文件
		if (file.isFile()) {
			return Arrays.asList(file.getAbsolutePath());
		}
		List<String> result = new ArrayList<String>();
		// 文件夹
		LinkedList<File> rootFiles = new LinkedList<>(Arrays.asList(file.listFiles()));
		while (!rootFiles.isEmpty()) {
			File removeFile = rootFiles.remove();
			if (removeFile.isFile()) {
				result.add(removeFile.getAbsolutePath());
			} else {
				rootFiles.addAll(Arrays.asList(removeFile.listFiles()));
			}
		}
		return result;
	}
}
