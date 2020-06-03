/**
 * 
 */
package raj.release.j8.features.bean;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author rsban
 *
 */
@ToString
@Getter
@Setter
public class Employee {
	
	private String name;
	private int id;
	private LocalDate dob;
	private Gender gender;
	private List<String> workHistory;
	private List<Qualification> qualification;
	private List<TechStack> techStack;
	
}


enum Gender {
	MALE, FEMALE, TRANSGENDER
}

enum Degree {
	HIGHSCHOOL, INTERMEDIATE, GRADUATE, POST_GRADUATE, PHD 
}

enum TechStack {
	JAVA, SPRING, STRUTS, BIGDATA, SPARK, AWS, DOT_NET, 
}

@Getter
@Setter
@ToString
class Qualification {
	private Degree degree;
	private String college;
	private float percentage;
	private LocalDate monthAndYearOfPassing;
	
}

