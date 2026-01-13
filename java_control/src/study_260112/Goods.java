package study_260112;

public class Goods {
	// 상품정보 (상품명, 상품가격, 카테고리, 수량)
	
	private String goodsName;
	private int price;
	private String category;
	private int stock;
	
	public Goods(String goodsName, int price, String category, int stock) {
		super();
		this.goodsName = goodsName;
		this.price = price;
		this.category = category;
		this.stock = stock;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Goods [goodsName=" + goodsName + ", price=" + price + ", category=" + category + ", stock=" + stock
				+ "]";
	}
	
	

}
