package tel_ran.tests.services.interfaces;

import java.util.List;

public interface IUserActionService {
	final static int FIRSTNAME = 0;
	final static int LASTTNAME = 1;
	final static int EMAIL = 2;
	final static int PASSWORD = 3;
		boolean AddingNewUser(String[] args);
		public String[] GetUserByMail(String userMail);
		boolean IsUserExist(String userMail,String userPassword);
		////
		public List<String> getCategoriesList();
		public String getMaxCategoryQuestions(String catName, String level);		
		String getTraineeQuestions(String category, int level, int qAmount);
		List<String> getComplexityLevelList();
		String getMaxCategoryLevelQuestions(String catName, String complexityLevel);
}