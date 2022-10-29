class ZadBook {
    public static void main(String[] args) {

    }
}
    public class Book{
        private int id;
        private  String title;
        private boolean  available = true;
        private Author author;
        private Author[] additionalAuthors;

        public Book(int id, String title){
            this.id = id;
            this.title = title;
        }
        public Book(int id, String title, Author author){
            this.id = id;
            this.title = title;
            this.author = author;
        }
        public Book(int id, String title, Author author, Author[] additionalAuthors ){
            this.id = id;
            this.title = title;
            this.author = author;
        }
        public void setId(int id){
            this.id = id;
        }
        public void setTitle(String title){
            this.title = title;
        }
        public  void setAvailable(boolean available){
            this.available = available;
        }
        public void setAuthor(Author author){
            this.author = author;
        }
        public void setAdditionalAuthors(Author[] additionalAuthors){
            this.additionalAuthors = additionalAuthors;
        }
        public int getId(){
            return this.id;
        }
        public String getTitle(){
            return this.title;
        }
        public boolean getAvailable(){
            return this.available;
        }
        public Author getAuthor(){
            return this.author;
        }
        public Author[] getAdditionalAuthors(){
            return this.additionalAuthors;
        }


        }



