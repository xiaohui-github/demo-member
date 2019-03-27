/**
 * 项目名称：common-api
 * 包	 名：com.xiaohui.demo.common.rest
 * 文件名称：RestResult.java
 * 文件路径：com.xiaohui.demo.common.rest.RestResult.java
 * 版权声明：xiaohui开发，归xiaohui所有
 * 版	 本：V100R001C00
 * 作        者：xiaohui
 * 邮	 箱：xuxiaohuimail@163.com
 * 创建日期：2019年3月27日
 */
package com.xiaohui.demo.common.rest;

import java.io.Serializable;

import lombok.Data;

/**
 * <RestResult.java>
 *
 * @author xiaohui
 * @Email xuxiaohuimail@163.com
 * @date 2019年3月27日
 * @version V100R001C00
 */
@Data
public class RestResult implements Serializable {

	/** serialVersionUID:TODO */
	private static final long serialVersionUID = -609567830370740568L;
	/** 数据 */
	private Object data = null;
	/** 状态码 */
	private Long code = 0L;
	/** 描述信息 */
	private String desc = "succeed";

	public RestResult() {
	}

	public RestResult(Long code, String desc) {
		this.desc = desc;
		this.code = code;
	}

	public RestResult(Object data) {
		this.data = data;
	}

}
