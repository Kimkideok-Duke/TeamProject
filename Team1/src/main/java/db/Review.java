package db;

public class Review {
    private String reviewno;
    private String rvtitle;
    private String rvcontent;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(String reviewno, String rvtitle, String rvcontent) {
		super();
		this.reviewno = reviewno;
		this.rvtitle = rvtitle;
		this.rvcontent = rvcontent;
	}
	public String getReviewno() {
		return reviewno;
	}
	public void setReviewno(String reviewno) {
		this.reviewno = reviewno;
	}
	public String getRvtitle() {
		return rvtitle;
	}
	public void setRvtitle(String rvtitle) {
		this.rvtitle = rvtitle;
	}
	public String getRvcontent() {
		return rvcontent;
	}
	public void setRvcontent(String rvcontent) {
		this.rvcontent = rvcontent;
	}

    
}
