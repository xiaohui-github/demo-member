/**
 * 项目名称：common-api
 * 包	 名：com.xiaohui.demo.common.rest
 * 文件名称：RestStateEnum.java
 * 文件路径：com.xiaohui.demo.common.rest.RestStateEnum.java
 * 版权声明：xiaohui开发，归xiaohui所有
 * 版	 本：V100R001C00
 * 作        者：xiaohui
 * 邮	 箱：xuxiaohuimail@163.com
 * 创建日期：2019年3月27日
 */
package com.xiaohui.demo.common.rest;

/**
 * <RestStateEnum.java>
 *
 * @author xiaohui
 * @Email xuxiaohuimail@163.com
 * @date 2019年3月27日
 * @version V100R001C00
 */
public enum RestStateEnum {

	/** 操作成功 */
	SUCCEED(0L, "operation succeed"),
	/** 操作失败 */
	FAILED(-1L, "operation failed"),
	/** 未知错误 */
	UNKNOW(-5L, "unknow error"),
	/** 数据库错误 */
	DATABASE(-8L, "unknow error"),
	/** 网络错误 */
	NETWORK(-9L, "network error");

	private Long code;
	private String desc;

	private RestStateEnum(Long code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Long getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
