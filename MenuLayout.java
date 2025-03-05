import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


/**
 * Custom layout based on VBox for a menu to select which algorithm to visualize.
 */
class MenuLayout extends VBox {
    /**
     * Basic constructor, initializes the menu with a button to each algorithm.
     */
    MenuLayout() {
        setAlignment(Pos.CENTER);

        Text title = new Text("Algorithm Visualizer");
        title.setFont(Font.font(24));
        
        FlowPane buttonsBox = new FlowPane();
        buttonsBox.setAlignment(Pos.CENTER);

        Button bubbleSortBtn = new Button("Bubble Sort");
        bubbleSortBtn.setOnAction(event -> FXUtils.setSceneRoot(getScene(), new BubbleSortLayout()));

        buttonsBox.getChildren().addAll(bubbleSortBtn);
        getChildren().addAll(title, buttonsBox);
    }
}
