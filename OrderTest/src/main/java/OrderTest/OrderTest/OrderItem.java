package OrderTest.OrderTest;


public class OrderItem {
    private String mItemName;
    private Long mTime;
    public OrderItem(){
        super();
    }
    public OrderItem(String pItemName,Long pTime) {
      this.mItemName=pItemName;
      this.mTime=pTime;
    }

    public void setItemName(String mItemName) {
        this.mItemName = mItemName;
    }

    public String getItemName() {
        return mItemName;
    }

    public void setTime(Long mTime) {
        this.mTime = mTime;
    }

    public Long getTime() {
        return mTime;
    }
}
