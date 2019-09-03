package トランプ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
	private final List<Card> cards = new ArrayList<Card>();

	public Deck() {
		List<Card.Mark> marks = Arrays.asList(
				Card.Mark.SPADE,
				Card.Mark.DIA,
				Card.Mark.HEART,
				Card.Mark.CLOVER);

		marks.forEach(mark -> {
			for(int number = 1; number <= 13; number++) {
				Card card = new Card(mark, number);
				cards.add(card);
			}
		});

	}

}
