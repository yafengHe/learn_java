package _extend.exercise;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("i7", 8, 512, "黑色");
        pc.getPcDetail();

        NotePad notePad = new NotePad("i9", 32, 1024, "白色");
        notePad.getNotePadInfo();

    }
}
