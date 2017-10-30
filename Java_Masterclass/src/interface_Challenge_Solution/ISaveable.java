package interface_Challenge_Solution;

import java.util.List;

public interface ISaveable {
	
	List<String> write();
	void read(List<String> savedValues);
}
