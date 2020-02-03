package com.Youcode.Exeptions;

import org.springframework.http.HttpStatus;

public class General_Exeptions  {
		private HttpStatus statut;
		
		private String message;

		public HttpStatus getStatut() {
			return statut;
		}

		public void setStatut(HttpStatus statut) {
			this.statut = statut;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public General_Exeptions(HttpStatus statut, String message) {
			super();
			this.statut = statut;
			this.message = message;
		}

		public General_Exeptions() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "General_Exeptions [statut=" + statut + ", message=" + message + "]";
		}
		
	
	

}
