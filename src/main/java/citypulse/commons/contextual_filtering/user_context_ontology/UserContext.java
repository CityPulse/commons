/**
 *
 */
package citypulse.commons.contextual_filtering.user_context_ontology;
/**
 * @author Thu-Le Pham
 * @date 8 Oct 2015
 */
public class UserContext {
	/**
	 *
	 */
	String userId;

	/**
	 * current activity
	 */
	Activity activity = new Activity();

	public UserContext() {
		super();
	}

	public UserContext(String userId, Activity activity) {
		super();
		this.userId = userId;
		this.activity = activity;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "UserContext [userId=" + userId + ", activity=" + activity + "]";
	}
}
