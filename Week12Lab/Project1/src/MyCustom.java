import java.util.Arrays;
public class MyCustom /* mycode*/ implements MyInterface {
	private Integer move_type = 0;
	private Boolean isAttack = false;

	public void move(String key) {
		if(key.equals("w")) {
			move_type = 1;
		}
		else if(key.equals("s")) {
			move_type = 2;
		}
		else if(key.equals("a")) {
			move_type = 3;
		}
		else if(key.equals("d")) {
			move_type = 4;
		}
		else {
			move_type = 5;
		}

		/* my code */
	}

	public void attack(String key) {
		isAttack= key.equals("spacebar");
		/* my code */
	}

	public void sortItem(Item[] itemList) {
		Arrays.sort(itemList);
		/* my code */
	}

	public Integer getMoveType()                                                                                                        {
		return move_type;
		/* my code */
	}

	public Boolean getIsAttack() {
		return isAttack;
		/* my code */
	}
}