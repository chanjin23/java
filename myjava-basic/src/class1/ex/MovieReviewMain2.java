package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews =new MovieReview[2];
        MovieReview movieReview1 =new MovieReview();
        movieReview1.review ="너무좋았습니다";
        movieReview1.title="인셉션";

        MovieReview movieReview2 =new MovieReview();
        movieReview2.review ="별로인데";
        movieReview2.title="내가만든영화";

        movieReviews[0]=movieReview1;
        movieReviews[1]=movieReview2;

        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목: " + "\""+ m.title +"\", 리뷰 : \""+m.title+"\"");
        }

        System.out.println("영화 제목: " + "\""+ movieReview2.title +"\", 리뷰 : \""+movieReview2.title+"\"");
        System.out.println("영화 제목: " + "\""+ movieReview1.title +"\", 리뷰 : \""+movieReview1.title+"\"");
    }
}
