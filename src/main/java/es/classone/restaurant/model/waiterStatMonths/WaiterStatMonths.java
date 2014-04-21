package es.classone.restaurant.model.waiterStatMonths;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table (name = "Res14cam_E2")
public class WaiterStatMonths {

		      private Long  R1CAM001_K2;//PK
		      private int  R1CAM993;//1=Actual, 2=Anterior y 3=Ante-Anterior
		       private int R1CAM994;//31 Dias (01->31)
		       private float R1CAM023;//Horas Trabajadas x Dia
		       private float R1CAM024;//Comensales Servidos x Dia
		       private float R1CAM025;//Mesas Servidos x Dia
		       
		       public WaiterStatMonths(){
		    	   
		       }

		       
			public WaiterStatMonths(Long r1cam001_K2, int r1cam993,
					int r1cam994, float r1cam023, float r1cam024, float r1cam025) {
				R1CAM001_K2 = r1cam001_K2;
				R1CAM993 = r1cam993;
				R1CAM994 = r1cam994;
				R1CAM023 = r1cam023;
				R1CAM024 = r1cam024;
				R1CAM025 = r1cam025;
			}

			@SequenceGenerator( // It only takes effect for
					name = "WaiterStatMonthsIdGenerator", // databases providing identifier
					sequenceName = "WaiterStatMonthsSeq")
					// generators.
					@Id
					@GeneratedValue(strategy = GenerationType.AUTO, generator = "WaiterStatMonthsIdGenerator")
			public Long getR1CAM001_K2() {
				return R1CAM001_K2;
			}

			public void setR1CAM001_K2(Long r1cam001_K2) {
				R1CAM001_K2 = r1cam001_K2;
			}

			public int getR1CAM993() {
				return R1CAM993;
			}

			public void setR1CAM993(int r1cam993) {
				R1CAM993 = r1cam993;
			}

			public int getR1CAM994() {
				return R1CAM994;
			}

			public void setR1CAM994(int r1cam994) {
				R1CAM994 = r1cam994;
			}

			public float getR1CAM023() {
				return R1CAM023;
			}

			public void setR1CAM023(float r1cam023) {
				R1CAM023 = r1cam023;
			}

			public float getR1CAM024() {
				return R1CAM024;
			}

			public void setR1CAM024(float r1cam024) {
				R1CAM024 = r1cam024;
			}

			public float getR1CAM025() {
				return R1CAM025;
			}

			public void setR1CAM025(float r1cam025) {
				R1CAM025 = r1cam025;
			}
		       
}
