package demo;
public class Test1 {
	public Test1() {
  }
  interface olaCustomer{
    void bookCab();
    void rentCab();
		void findARide();
		void rateDriver();
    void scheduleCab(); 
    void  cancelCab();
    void addMoneytowallet();
    void raiseTicket();
    void signup(); 
    void signIn();
  }
  interface olaDriver{
    void acceptBooking();
		void getCustomerLocation();
    void setAvailableStatus(); 
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void setUpYourVehicle();
    void callCustomer();
    void customerFeedback();
  }
  interface olaOwner{
    void getDriverRecords();
		void getReportByDriverID();
    void getReportByegion(); 
    void getTotalRevenue();
    void getcustomerFeedback();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
  }
}
