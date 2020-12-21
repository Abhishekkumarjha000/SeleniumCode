package com.jenkins.demo;

import java.util.List;

public class Serialization {
	
	           private String page;
	           private String per_page;
	           private String total;
	           private String total_pages;
	           private List<datapojo> data;
	           private supportpojo support;
	           
			public String getPage() {
				return page;
			}
			public void setPage(String page) {
				this.page = page;
			}
			public String getper_page() {
				return per_page;
			}
			public void setper_page(String per_page) {
				this.per_page = per_page;
			}
			public String getTotal() {
				return total;
			}
			public void setTotal(String total) {
				this.total = total;
			}
			public String getTotal_pages() {
				return total_pages;
			}
			public void setTotal_pages(String total_pages) {
				this.total_pages = total_pages;
			}
			public List<datapojo> getData() {
				return data;
			}
			public void setData(List<datapojo> data) {
				this.data = data;
			}
			public supportpojo getSupport() {
				return support;
			}
			public void setSupport(supportpojo support) {
				this.support = support;
			}
			@Override
			public String toString() {
				return "Serialization [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
						+ total_pages + ", data=" + data + ", support=" + support + "]";
			}
			
	           

}
