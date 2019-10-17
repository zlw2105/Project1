public class CustomerModel {
    public int mCustomerID;
    public String mName, mPhone, mAddress;

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(mCustomerID).append(",");
        sb.append("\"").append(mName).append("\"").append(",");
        sb.append(mPhone).append(",");
        sb.append(mAddress).append(")");
        return sb.toString();
    }
}


