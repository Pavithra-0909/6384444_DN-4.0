public class WebApp implements Observer {
    private String siteName;

    public WebApp(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("WebApp [" + siteName + "] - " + stockName + " updated to Rs." + stockPrice);
    }
}
