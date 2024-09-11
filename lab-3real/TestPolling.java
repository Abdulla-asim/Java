public class TestPolling {
    public static void main(String[] args) {
        String[] topics = {"Climate", "Gender Equality", "Employment", "Education", "Economy"};
        Polling poll = new Polling(topics);
        poll.rateTopics();
        poll.displayRatings();
        poll.displayHighestRating();
        poll.displayLowestRating();
    }
}
