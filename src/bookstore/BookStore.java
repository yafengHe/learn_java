package bookstore;

public class BookStore {
    /** 管理员 */
    private static final int BOOKSTORE_ADMIN = 0;
    /** VIP */
    private static final int BOOKSTORE_VIP = 1;
    /** 普通用户 */
    private static final int BOOKSTORE_NORMAL = 2;

    /**
     * 根据身份标识 价格给予相应的折扣
     * @param price 价格
     * @param identity 身份标识 管理员：5折 vip会员 8折 普通用户 不打折
     */
    public void buyBook(double price, int identity) {
        int a = '2';
        switch (identity) {
            case BOOKSTORE_ADMIN:
                System.out.println("尊敬的用户，您买的商品的价格是" + price * 0.5);
                break;
            case BOOKSTORE_VIP:
                System.out.println("尊敬的用户，您买的商品的价格是" + price * 0.8);
                break;
            case BOOKSTORE_NORMAL:
                System.out.println("尊敬的用户，您买的商品的价格是" + price);
                break;
            default:
                System.out.println("没有权限无法买书。");
        }
    }
}
