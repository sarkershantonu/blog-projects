package com.ChainOfResponsibility;
/***
 * We can use this interface also
 * @author shantonu
 *
 */
public interface IMyHadler {
	void setMyNextHandler(MyHandler successor);
	void doThis(Task task);	
}
