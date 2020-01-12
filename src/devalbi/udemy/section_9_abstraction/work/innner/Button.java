package devalbi.udemy.section_9_abstraction.work.innner;

public class Button {

    private String title;
    private OnclickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    //Step 2 sets ClickListener from main class local method as the onClickListener
    public void setOnClickListnner(OnclickListener onClickListener){
        this.onClickListener = onClickListener;

    }

    //Called by step 4
    public void onClick(){
        //Step 5 - Sees the ClickListener local class in Main and calls it's onClick method
        this.onClickListener.onClick(this.title);
    }

    public interface OnclickListener {
        public void onClick(String title);
    }

    public String getTitle() {
        return title;
    }
}
