package com.xuebusi.fjf.mq.exceptions;


/**
 * @ClassName: com.ymhj.yjf.mq.exceptions
 * @Description:
 * @date 16/7/27
 */
public class KafkaBaseException extends RuntimeException {

	private static final long serialVersionUID = -1947126060083993557L;

	public KafkaBaseException(String message){
    	super(message);
    }

}
