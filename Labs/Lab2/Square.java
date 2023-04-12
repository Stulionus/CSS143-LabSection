package Labs.Lab2;

public class Square {
        private int x;
        private int y;

        private int width;
        private int height;
        private String consOut = "[]";

        public Square(){
            x = 0;
            y = 0;
            width = 0;
            height = 0;
        }

        public Square(int xIn, int yIn){
            x = xIn;
            y = yIn;
            width = 0;
            height = 0;
        }


        public Square(int xIn, int yIn, int lengthIn, int widthIn){
            x = xIn;
            y = yIn;
            width = widthIn;
            height = lengthIn;
        }

        public void draw(){
            System.out.println(consOut);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getArea(){
            return width * height;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setHeight(int lengthIn) {
            height = lengthIn;
        }

        public void setWidth(int widthIn) {
            width = widthIn;
        }

        @Override
        public String toString(){
            return "[]";
        }

        public boolean equals(Square that){
            if (this.x == that.x && this.y == that.y && this.width == that.width && this.height == that.height){
                return true;
            } else {return false;}
        }
}
