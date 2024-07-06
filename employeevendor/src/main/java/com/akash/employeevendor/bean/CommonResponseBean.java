package com.akash.employeevendor.bean;

public class CommonResponseBean {
	
	 private int statusCode;
	    private String status;
	    private String errorMsg;
	    private Object data;
	    
		public CommonResponseBean() {
			super();
		}

		public CommonResponseBean(int statusCode, String status, String errorMsg, Object data) {
			super();
			this.statusCode = statusCode;
			this.status = status;
			this.errorMsg = errorMsg;
			this.data = data;
		}

		public int getStatusCode() {
			return statusCode;
		}

		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getErrorMsg() {
			return errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "CommonResponseBean [statusCode=" + statusCode + ", status=" + status + ", errorMsg=" + errorMsg
					+ ", data=" + data + "]";
		}

}
