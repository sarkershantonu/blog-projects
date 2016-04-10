package com.stateDesignPattern;
//Context Interface
public interface IMobile {
	public void setMobileState(IState aState);
	public void ChargeMobile();
	public void USBConnect();
	public void AdbAccess();
	public IState getCharging() ;
	public IState getUsb() ;
	public IState getAdb() ;
}
