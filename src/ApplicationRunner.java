
import java.io.File;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class ApplicationRunner extends Application {

    Image front;
    Image drive;
    Image back;
    Image side;
    Image muteScreen;

    @Override
    public void start(Stage primaryStage) throws Exception {

        String imgPath = System.getProperty("user.dir")
                + File.separator + "images"
                + File.separator + "front.jpg";

        String imageURI = Paths.get(imgPath).toUri().toString();

        front = new Image(imageURI);

        imgPath = System.getProperty("user.dir")
                + File.separator + "images"
                + File.separator + "drive.jpg";

        imageURI = Paths.get(imgPath).toUri().toString();

        drive = new Image(imageURI);

        imgPath = System.getProperty("user.dir")
                + File.separator + "images"
                + File.separator + "back.jpg";

        imageURI = Paths.get(imgPath).toUri().toString();

        back = new Image(imageURI);

        imgPath = System.getProperty("user.dir")
                + File.separator + "images"
                + File.separator + "side.jpg";

        imageURI = Paths.get(imgPath).toUri().toString();

        side = new Image(imageURI);

        imgPath = System.getProperty("user.dir")
                + File.separator + "images"
                + File.separator + "mute-screen.gif";

        imageURI = Paths.get(imgPath).toUri().toString();

        muteScreen = new Image(imageURI);

        StackPane root = new StackPane();

        HBox hbox = new HBox(30);

        VBox vbox = new VBox(10);
        GridPane lightingOutline = new GridPane();
        lightingOutline.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        lightingOutline.setBorder(new Border(new BorderStroke(Color.DARKGRAY, BorderStrokeStyle.SOLID, new CornerRadii(4), new BorderWidths(2))));
        lightingOutline.setPrefWidth(315);
        lightingOutline.setPrefHeight(248);
        Label labelLighting = new Label("Lighting");
        labelLighting.setPadding(new Insets(5));
        labelLighting.setFont(Font.font("Arial", FontWeight.BOLD, 13.5));
        Label lblHall = new Label("Hall:");
        lblHall.setFont(Font.font("Arial", 13));
        lblHall.setTranslateX(60);
        lblHall.setTranslateY(28);
        Slider slider = new Slider();
        slider.prefWidth(600);
        slider.setTranslateX(95);   //Width
        slider.setTranslateY(30);   //Height
        slider.setValue(50);
        Circle c1 = new Circle(12);
        c1.setFill(Color.OLIVE);
        c1.setStrokeWidth(1);
        c1.setStroke(Color.OLIVE);
        c1.setTranslateX(240);
        c1.setTranslateY(30);

        slider.setOnMouseDragged(e -> {
            if (slider.getValue() > 50 && slider.getValue() < 60) {
                c1.setFill(Color.rgb(153, 153, 0));
            } else if (slider.getValue() > 60 && slider.getValue() < 70) {
                c1.setFill(Color.rgb(179, 179, 0));
            } else if (slider.getValue() > 80 && slider.getValue() < 90) {
                c1.setFill(Color.rgb(204, 204, 0));
            } else if (slider.getValue() > 90 && slider.getValue() <= 95) {
                c1.setFill(Color.rgb(230, 230, 0));
            } else if (slider.getValue() == 100) {
                c1.setFill(Color.rgb(255, 255, 0));
            } else if (slider.getValue() == 50) {
                c1.setFill(Color.OLIVE);
            } else if (slider.getValue() > 0 && slider.getValue() < 10) {
                c1.setFill(Color.rgb(0, 0, 0));
            } else if (slider.getValue() > 10 && slider.getValue() < 20) {
                c1.setFill(Color.rgb(26, 26, 0));
            } else if (slider.getValue() > 20 && slider.getValue() < 30) {
                c1.setFill(Color.rgb(51, 51, 0));
            } else if (slider.getValue() > 30 && slider.getValue() < 40) {
                c1.setFill(Color.rgb(77, 77, 0));
            } else if (slider.getValue() > 40 && slider.getValue() < 50) {
                c1.setFill(Color.rgb(102, 102, 0));
            } else if (slider.getValue() == 0) {
                c1.setFill(Color.rgb(0, 0, 0));
            }
        });

        slider.setOnMouseClicked(e -> {
            if (slider.getValue() > 50 && slider.getValue() < 60) {
                c1.setFill(Color.rgb(153, 153, 0));
            } else if (slider.getValue() > 60 && slider.getValue() < 70) {
                c1.setFill(Color.rgb(179, 179, 0));
            } else if (slider.getValue() > 80 && slider.getValue() < 90) {
                c1.setFill(Color.rgb(204, 204, 0));
            } else if (slider.getValue() > 90 && slider.getValue() <= 95) {
                c1.setFill(Color.rgb(230, 230, 0));
            } else if (slider.getValue() == 100) {
                c1.setFill(Color.rgb(255, 255, 0));
            } else if (slider.getValue() == 50) {
                c1.setFill(Color.OLIVE);
            } else if (slider.getValue() > 0 && slider.getValue() < 10) {
                c1.setFill(Color.rgb(0, 0, 0));
            } else if (slider.getValue() > 10 && slider.getValue() < 20) {
                c1.setFill(Color.rgb(26, 26, 0));
            } else if (slider.getValue() > 20 && slider.getValue() < 30) {
                c1.setFill(Color.rgb(51, 51, 0));
            } else if (slider.getValue() > 30 && slider.getValue() < 40) {
                c1.setFill(Color.rgb(77, 77, 0));
            } else if (slider.getValue() > 40 && slider.getValue() < 50) {
                c1.setFill(Color.rgb(102, 102, 0));
            } else if (slider.getValue() == 0) {
                c1.setFill(Color.rgb(0, 0, 0));
            }
        });

        Label lblKicthen = new Label("Kicthen:");
        lblKicthen.setFont(Font.font("Arial", 13));
        lblKicthen.setTranslateX(37);
        lblKicthen.setTranslateY(57);
        Slider slider2 = new Slider();
        slider2.setTranslateX(95);   //Width
        slider2.setTranslateY(59);   //Height
        slider2.setValue(50);
        Circle c2 = new Circle(12);
        c2.setFill(Color.OLIVE);
        c2.setStrokeWidth(1);
        c2.setStroke(Color.OLIVE);
        c2.setTranslateX(240);
        c2.setTranslateY(60);

        slider2.setOnMouseDragged(e -> {
            if (slider2.getValue() > 50 && slider2.getValue() < 60) {
                c2.setFill(Color.rgb(153, 153, 0));
            } else if (slider2.getValue() > 60 && slider2.getValue() < 70) {
                c2.setFill(Color.rgb(179, 179, 0));
            } else if (slider2.getValue() > 80 && slider2.getValue() < 90) {
                c2.setFill(Color.rgb(204, 204, 0));
            } else if (slider2.getValue() > 90 && slider2.getValue() <= 95) {
                c2.setFill(Color.rgb(230, 230, 0));
            } else if (slider2.getValue() == 100) {
                c2.setFill(Color.rgb(255, 255, 0));
            } else if (slider2.getValue() == 50) {
                c2.setFill(Color.OLIVE);
            } else if (slider2.getValue() > 0 && slider2.getValue() < 10) {
                c2.setFill(Color.rgb(0, 0, 0));
            } else if (slider2.getValue() > 10 && slider2.getValue() < 20) {
                c2.setFill(Color.rgb(26, 26, 0));
            } else if (slider2.getValue() > 20 && slider2.getValue() < 30) {
                c2.setFill(Color.rgb(51, 51, 0));
            } else if (slider2.getValue() > 30 && slider2.getValue() < 40) {
                c2.setFill(Color.rgb(77, 77, 0));
            } else if (slider2.getValue() > 40 && slider2.getValue() < 50) {
                c2.setFill(Color.rgb(102, 102, 0));
            } else if (slider2.getValue() == 0) {
                c2.setFill(Color.rgb(0, 0, 0));
            }
        });

        slider2.setOnMouseClicked(e -> {
            if (slider2.getValue() > 50 && slider2.getValue() < 60) {
                c2.setFill(Color.rgb(153, 153, 0));
            } else if (slider2.getValue() > 60 && slider2.getValue() < 70) {
                c2.setFill(Color.rgb(179, 179, 0));
            } else if (slider2.getValue() > 80 && slider2.getValue() < 90) {
                c2.setFill(Color.rgb(204, 204, 0));
            } else if (slider2.getValue() > 90 && slider2.getValue() <= 95) {
                c2.setFill(Color.rgb(230, 230, 0));
            } else if (slider2.getValue() == 100) {
                c2.setFill(Color.rgb(255, 255, 0));
            } else if (slider2.getValue() == 50) {
                c2.setFill(Color.OLIVE);
            } else if (slider2.getValue() > 0 && slider2.getValue() < 10) {
                c2.setFill(Color.rgb(0, 0, 0));
            } else if (slider2.getValue() > 10 && slider2.getValue() < 20) {
                c2.setFill(Color.rgb(26, 26, 0));
            } else if (slider2.getValue() > 20 && slider2.getValue() < 30) {
                c2.setFill(Color.rgb(51, 51, 0));
            } else if (slider2.getValue() > 30 && slider2.getValue() < 40) {
                c2.setFill(Color.rgb(77, 77, 0));
            } else if (slider2.getValue() > 40 && slider2.getValue() < 50) {
                c2.setFill(Color.rgb(102, 102, 0));
            } else if (slider2.getValue() == 0) {
                c2.setFill(Color.rgb(0, 0, 0));
            }
        });

        Label lblDiningRoom = new Label("Dining room:");
        lblDiningRoom.setFont(Font.font("Arial", 13));
        lblDiningRoom.setTranslateX(13);
        lblDiningRoom.setTranslateY(88);
        Slider slider3 = new Slider();
        slider3.setTranslateX(95);   //Width
        slider3.setTranslateY(90);   //Height
        slider3.setValue(50);
        Circle c3 = new Circle(12);
        c3.setFill(Color.OLIVE);
        c3.setStrokeWidth(1);
        c3.setStroke(Color.OLIVE);
        c3.setTranslateX(240);
        c3.setTranslateY(90);

        slider3.setOnMouseDragged(e -> {
            if (slider3.getValue() > 50 && slider3.getValue() < 60) {
                c3.setFill(Color.rgb(153, 153, 0));
            } else if (slider3.getValue() > 60 && slider3.getValue() < 70) {
                c3.setFill(Color.rgb(179, 179, 0));
            } else if (slider3.getValue() > 80 && slider3.getValue() < 90) {
                c3.setFill(Color.rgb(204, 204, 0));
            } else if (slider3.getValue() > 90 && slider3.getValue() <= 95) {
                c3.setFill(Color.rgb(230, 230, 0));
            } else if (slider3.getValue() == 100) {
                c3.setFill(Color.rgb(255, 255, 0));
            } else if (slider3.getValue() == 50) {
                c3.setFill(Color.OLIVE);
            } else if (slider3.getValue() > 0 && slider3.getValue() < 10) {
                c3.setFill(Color.rgb(0, 0, 0));
            } else if (slider3.getValue() > 10 && slider3.getValue() < 20) {
                c3.setFill(Color.rgb(26, 26, 0));
            } else if (slider3.getValue() > 20 && slider3.getValue() < 30) {
                c3.setFill(Color.rgb(51, 51, 0));
            } else if (slider3.getValue() > 30 && slider3.getValue() < 40) {
                c3.setFill(Color.rgb(77, 77, 0));
            } else if (slider3.getValue() > 40 && slider3.getValue() < 50) {
                c3.setFill(Color.rgb(102, 102, 0));
            } else if (slider3.getValue() == 0) {
                c3.setFill(Color.rgb(0, 0, 0));
            }
        });

        slider3.setOnMouseClicked(e -> {
            if (slider3.getValue() > 50 && slider3.getValue() < 60) {
                c3.setFill(Color.rgb(153, 153, 0));
            } else if (slider3.getValue() > 60 && slider3.getValue() < 70) {
                c3.setFill(Color.rgb(179, 179, 0));
            } else if (slider3.getValue() > 80 && slider3.getValue() < 90) {
                c3.setFill(Color.rgb(204, 204, 0));
            } else if (slider3.getValue() > 90 && slider3.getValue() <= 95) {
                c3.setFill(Color.rgb(230, 230, 0));
            } else if (slider3.getValue() == 100) {
                c3.setFill(Color.rgb(255, 255, 0));
            } else if (slider3.getValue() == 50) {
                c3.setFill(Color.OLIVE);
            } else if (slider3.getValue() > 0 && slider3.getValue() < 10) {
                c3.setFill(Color.rgb(0, 0, 0));
            } else if (slider3.getValue() > 10 && slider3.getValue() < 20) {
                c3.setFill(Color.rgb(26, 26, 0));
            } else if (slider3.getValue() > 20 && slider3.getValue() < 30) {
                c3.setFill(Color.rgb(51, 51, 0));
            } else if (slider3.getValue() > 30 && slider3.getValue() < 40) {
                c3.setFill(Color.rgb(77, 77, 0));
            } else if (slider3.getValue() > 40 && slider3.getValue() < 50) {
                c3.setFill(Color.rgb(102, 102, 0));
            } else if (slider3.getValue() == 0) {
                c3.setFill(Color.rgb(0, 0, 0));
            }
        });

        Label lblLivingRoom = new Label("Living room:");
        lblLivingRoom.setFont(Font.font("Arial", 13));
        lblLivingRoom.setTranslateX(17);
        lblLivingRoom.setTranslateY(118);
        Slider slider4 = new Slider();
        slider4.setTranslateX(95);   //Width
        slider4.setTranslateY(120);   //Height
        slider4.setValue(50);
        Circle c4 = new Circle(12);
        c4.setFill(Color.OLIVE);
        c4.setStrokeWidth(1);
        c4.setStroke(Color.OLIVE);
        c4.setTranslateX(240);
        c4.setTranslateY(120);

        slider4.setOnMouseDragged(e -> {
            if (slider4.getValue() > 50 && slider4.getValue() < 60) {
                c4.setFill(Color.rgb(153, 153, 0));
            } else if (slider4.getValue() > 60 && slider4.getValue() < 70) {
                c4.setFill(Color.rgb(179, 179, 0));
            } else if (slider4.getValue() > 80 && slider4.getValue() < 90) {
                c4.setFill(Color.rgb(204, 204, 0));
            } else if (slider4.getValue() > 90 && slider4.getValue() <= 95) {
                c4.setFill(Color.rgb(230, 230, 0));
            } else if (slider4.getValue() == 100) {
                c4.setFill(Color.rgb(255, 255, 0));
            } else if (slider4.getValue() == 50) {
                c4.setFill(Color.OLIVE);
            } else if (slider4.getValue() > 0 && slider4.getValue() < 10) {
                c4.setFill(Color.rgb(0, 0, 0));
            } else if (slider4.getValue() > 10 && slider4.getValue() < 20) {
                c4.setFill(Color.rgb(26, 26, 0));
            } else if (slider4.getValue() > 20 && slider4.getValue() < 30) {
                c4.setFill(Color.rgb(51, 51, 0));
            } else if (slider4.getValue() > 30 && slider4.getValue() < 40) {
                c4.setFill(Color.rgb(77, 77, 0));
            } else if (slider4.getValue() > 40 && slider4.getValue() < 50) {
                c4.setFill(Color.rgb(102, 102, 0));
            } else if (slider4.getValue() == 0) {
                c4.setFill(Color.rgb(0, 0, 0));
            }
        });

        slider4.setOnMouseClicked(e -> {
            if (slider4.getValue() > 50 && slider4.getValue() < 60) {
                c4.setFill(Color.rgb(153, 153, 0));
            } else if (slider4.getValue() > 60 && slider4.getValue() < 70) {
                c4.setFill(Color.rgb(179, 179, 0));
            } else if (slider4.getValue() > 80 && slider4.getValue() < 90) {
                c4.setFill(Color.rgb(204, 204, 0));
            } else if (slider4.getValue() > 90 && slider4.getValue() <= 95) {
                c4.setFill(Color.rgb(230, 230, 0));
            } else if (slider4.getValue() == 100) {
                c4.setFill(Color.rgb(255, 255, 0));
            } else if (slider4.getValue() == 50) {
                c4.setFill(Color.OLIVE);
            } else if (slider4.getValue() > 0 && slider4.getValue() < 10) {
                c4.setFill(Color.rgb(0, 0, 0));
            } else if (slider4.getValue() > 10 && slider4.getValue() < 20) {
                c4.setFill(Color.rgb(26, 26, 0));
            } else if (slider4.getValue() > 20 && slider4.getValue() < 30) {
                c4.setFill(Color.rgb(51, 51, 0));
            } else if (slider4.getValue() > 30 && slider4.getValue() < 40) {
                c4.setFill(Color.rgb(77, 77, 0));
            } else if (slider4.getValue() > 40 && slider4.getValue() < 50) {
                c4.setFill(Color.rgb(102, 102, 0));
            } else if (slider4.getValue() == 0) {
                c4.setFill(Color.rgb(0, 0, 0));
            }
        });

        Label lblLanding = new Label("Landing:");
        lblLanding.setFont(Font.font("Arial", 13));
        lblLanding.setTranslateX(35);
        lblLanding.setTranslateY(148);
        Slider slider5 = new Slider();
        slider5.setTranslateX(95);   //Width
        slider5.setTranslateY(150);   //Height
        slider5.setValue(50);
        Circle c5 = new Circle(12);
        c5.setFill(Color.OLIVE);
        c5.setStrokeWidth(1);
        c5.setStroke(Color.OLIVE);
        c5.setTranslateX(240);
        c5.setTranslateY(150);

        slider5.setOnMouseDragged(e -> {
            if (slider5.getValue() > 50 && slider5.getValue() < 60) {
                c5.setFill(Color.rgb(153, 153, 0));
            } else if (slider5.getValue() > 60 && slider5.getValue() < 70) {
                c5.setFill(Color.rgb(179, 179, 0));
            } else if (slider5.getValue() > 80 && slider5.getValue() < 90) {
                c5.setFill(Color.rgb(204, 204, 0));
            } else if (slider5.getValue() > 90 && slider5.getValue() <= 95) {
                c5.setFill(Color.rgb(230, 230, 0));
            } else if (slider5.getValue() == 100) {
                c5.setFill(Color.rgb(255, 255, 0));
            } else if (slider5.getValue() == 50) {
                c5.setFill(Color.OLIVE);
            } else if (slider5.getValue() > 0 && slider5.getValue() < 10) {
                c5.setFill(Color.rgb(0, 0, 0));
            } else if (slider5.getValue() > 10 && slider5.getValue() < 20) {
                c5.setFill(Color.rgb(26, 26, 0));
            } else if (slider5.getValue() > 20 && slider5.getValue() < 30) {
                c5.setFill(Color.rgb(51, 51, 0));
            } else if (slider5.getValue() > 30 && slider5.getValue() < 40) {
                c5.setFill(Color.rgb(77, 77, 0));
            } else if (slider5.getValue() > 40 && slider5.getValue() < 50) {
                c5.setFill(Color.rgb(102, 102, 0));
            } else if (slider5.getValue() == 0) {
                c5.setFill(Color.rgb(0, 0, 0));
            }
        });

        slider5.setOnMouseClicked(e -> {
            if (slider5.getValue() > 50 && slider5.getValue() < 60) {
                c5.setFill(Color.rgb(153, 153, 0));
            } else if (slider5.getValue() > 60 && slider5.getValue() < 70) {
                c5.setFill(Color.rgb(179, 179, 0));
            } else if (slider5.getValue() > 80 && slider5.getValue() < 90) {
                c5.setFill(Color.rgb(204, 204, 0));
            } else if (slider5.getValue() > 90 && slider5.getValue() <= 95) {
                c5.setFill(Color.rgb(230, 230, 0));
            } else if (slider5.getValue() == 100) {
                c5.setFill(Color.rgb(255, 255, 0));
            } else if (slider5.getValue() == 50) {
                c5.setFill(Color.OLIVE);
            } else if (slider5.getValue() > 0 && slider5.getValue() < 10) {
                c5.setFill(Color.rgb(0, 0, 0));
            } else if (slider5.getValue() > 10 && slider5.getValue() < 20) {
                c5.setFill(Color.rgb(26, 26, 0));
            } else if (slider5.getValue() > 20 && slider5.getValue() < 30) {
                c5.setFill(Color.rgb(51, 51, 0));
            } else if (slider5.getValue() > 30 && slider5.getValue() < 40) {
                c5.setFill(Color.rgb(77, 77, 0));
            } else if (slider5.getValue() > 40 && slider5.getValue() < 50) {
                c5.setFill(Color.rgb(102, 102, 0));
            } else if (slider5.getValue() == 0) {
                c5.setFill(Color.rgb(0, 0, 0));
            }
        });

        Label lblBedroomOne = new Label("Bedroom 1:");
        lblBedroomOne.setFont(Font.font("Arial", 13));
        lblBedroomOne.setTranslateX(20);
        lblBedroomOne.setTranslateY(178);
        Slider slider6 = new Slider();
        slider6.setTranslateX(95);   //Width
        slider6.setTranslateY(180);   //Height
        slider6.setValue(50);
        Circle c6 = new Circle(12);
        c6.setFill(Color.OLIVE);
        c6.setStrokeWidth(1);
        c6.setStroke(Color.OLIVE);
        c6.setTranslateX(240);
        c6.setTranslateY(180);

        slider6.setOnMouseDragged(e -> {
            if (slider6.getValue() > 50 && slider6.getValue() < 60) {
                c6.setFill(Color.rgb(153, 153, 0));
            } else if (slider6.getValue() > 60 && slider6.getValue() < 70) {
                c6.setFill(Color.rgb(179, 179, 0));
            } else if (slider6.getValue() > 80 && slider6.getValue() < 90) {
                c6.setFill(Color.rgb(204, 204, 0));
            } else if (slider6.getValue() > 90 && slider6.getValue() <= 95) {
                c6.setFill(Color.rgb(230, 230, 0));
            } else if (slider6.getValue() == 100) {
                c6.setFill(Color.rgb(255, 255, 0));
            } else if (slider6.getValue() == 50) {
                c6.setFill(Color.OLIVE);
            } else if (slider6.getValue() > 0 && slider6.getValue() < 10) {
                c6.setFill(Color.rgb(0, 0, 0));
            } else if (slider6.getValue() > 10 && slider6.getValue() < 20) {
                c6.setFill(Color.rgb(26, 26, 0));
            } else if (slider6.getValue() > 20 && slider6.getValue() < 30) {
                c6.setFill(Color.rgb(51, 51, 0));
            } else if (slider6.getValue() > 30 && slider6.getValue() < 40) {
                c6.setFill(Color.rgb(77, 77, 0));
            } else if (slider6.getValue() > 40 && slider6.getValue() < 50) {
                c6.setFill(Color.rgb(102, 102, 0));
            } else if (slider6.getValue() == 0) {
                c6.setFill(Color.rgb(0, 0, 0));
            }
        });

        slider6.setOnMouseClicked(e -> {
            if (slider6.getValue() > 50 && slider6.getValue() < 60) {
                c6.setFill(Color.rgb(153, 153, 0));
            } else if (slider6.getValue() > 60 && slider6.getValue() < 70) {
                c6.setFill(Color.rgb(179, 179, 0));
            } else if (slider6.getValue() > 80 && slider6.getValue() < 90) {
                c6.setFill(Color.rgb(204, 204, 0));
            } else if (slider6.getValue() > 90 && slider6.getValue() <= 95) {
                c6.setFill(Color.rgb(230, 230, 0));
            } else if (slider6.getValue() == 100) {
                c6.setFill(Color.rgb(255, 255, 0));
            } else if (slider6.getValue() == 50) {
                c6.setFill(Color.OLIVE);
            } else if (slider6.getValue() > 0 && slider6.getValue() < 10) {
                c6.setFill(Color.rgb(0, 0, 0));
            } else if (slider6.getValue() > 10 && slider6.getValue() < 20) {
                c6.setFill(Color.rgb(26, 26, 0));
            } else if (slider6.getValue() > 20 && slider6.getValue() < 30) {
                c6.setFill(Color.rgb(51, 51, 0));
            } else if (slider6.getValue() > 30 && slider6.getValue() < 40) {
                c6.setFill(Color.rgb(77, 77, 0));
            } else if (slider6.getValue() > 40 && slider6.getValue() < 50) {
                c6.setFill(Color.rgb(102, 102, 0));
            } else if (slider6.getValue() == 0) {
                c6.setFill(Color.rgb(0, 0, 0));
            }
        });

        Label lblBedroomTwo = new Label("Bedroom 2:");
        lblBedroomTwo.setFont(Font.font("Arial", 13));
        lblBedroomTwo.setTranslateX(20);
        lblBedroomTwo.setTranslateY(210);
        Slider slider7 = new Slider();
        slider7.setTranslateX(95);   //Width
        slider7.setTranslateY(210);   //Height
        slider7.setValue(50);
        Circle c7 = new Circle(12);
        c7.setFill(Color.OLIVE);
        c7.setStrokeWidth(1);
        c7.setStroke(Color.OLIVE);
        c7.setTranslateX(240);
        c7.setTranslateY(210);

        slider7.setOnMouseDragged(e -> {
            if (slider7.getValue() > 50 && slider7.getValue() < 60) {
                c7.setFill(Color.rgb(153, 153, 0));
            } else if (slider7.getValue() > 60 && slider7.getValue() < 70) {
                c7.setFill(Color.rgb(179, 179, 0));
            } else if (slider7.getValue() > 80 && slider7.getValue() < 90) {
                c7.setFill(Color.rgb(204, 204, 0));
            } else if (slider7.getValue() > 90 && slider7.getValue() <= 95) {
                c7.setFill(Color.rgb(230, 230, 0));
            } else if (slider7.getValue() == 100) {
                c7.setFill(Color.rgb(255, 255, 0));
            } else if (slider7.getValue() == 50) {
                c7.setFill(Color.OLIVE);
            } else if (slider7.getValue() > 0 && slider7.getValue() < 10) {
                c7.setFill(Color.rgb(0, 0, 0));
            } else if (slider7.getValue() > 10 && slider7.getValue() < 20) {
                c7.setFill(Color.rgb(26, 26, 0));
            } else if (slider7.getValue() > 20 && slider7.getValue() < 30) {
                c7.setFill(Color.rgb(51, 51, 0));
            } else if (slider7.getValue() > 30 && slider7.getValue() < 40) {
                c7.setFill(Color.rgb(77, 77, 0));
            } else if (slider7.getValue() > 40 && slider7.getValue() < 50) {
                c7.setFill(Color.rgb(102, 102, 0));
            } else if (slider7.getValue() == 0) {
                c7.setFill(Color.rgb(0, 0, 0));
            }
        });

        slider7.setOnMouseClicked(e -> {
            if (slider7.getValue() > 50 && slider7.getValue() < 60) {
                c7.setFill(Color.rgb(153, 153, 0));
            } else if (slider7.getValue() > 60 && slider7.getValue() < 70) {
                c7.setFill(Color.rgb(179, 179, 0));
            } else if (slider7.getValue() > 80 && slider7.getValue() < 90) {
                c7.setFill(Color.rgb(204, 204, 0));
            } else if (slider7.getValue() > 90 && slider7.getValue() <= 95) {
                c7.setFill(Color.rgb(230, 230, 0));
            } else if (slider7.getValue() == 100) {
                c7.setFill(Color.rgb(255, 255, 0));
            } else if (slider7.getValue() == 50) {
                c7.setFill(Color.OLIVE);
            } else if (slider7.getValue() > 0 && slider7.getValue() < 10) {
                c7.setFill(Color.rgb(0, 0, 0));
            } else if (slider7.getValue() > 10 && slider7.getValue() < 20) {
                c7.setFill(Color.rgb(26, 26, 0));
            } else if (slider7.getValue() > 20 && slider7.getValue() < 30) {
                c7.setFill(Color.rgb(51, 51, 0));
            } else if (slider7.getValue() > 30 && slider7.getValue() < 40) {
                c7.setFill(Color.rgb(77, 77, 0));
            } else if (slider7.getValue() > 40 && slider7.getValue() < 50) {
                c7.setFill(Color.rgb(102, 102, 0));
            } else if (slider7.getValue() == 0) {
                c7.setFill(Color.rgb(0, 0, 0));
            }
        });

        lightingOutline.getChildren().addAll(labelLighting, slider, lblHall, c1, lblKicthen, slider2, c2, lblDiningRoom, slider3, c3, lblLivingRoom, slider4, c4, lblLanding, slider5, c5, lblBedroomOne, slider6, c6, lblBedroomTwo, slider7, c7);

        GridPane centralHeatingOutline = new GridPane();
        centralHeatingOutline.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        centralHeatingOutline.setBorder(new Border(new BorderStroke(Color.DARKGRAY, BorderStrokeStyle.SOLID, new CornerRadii(4), new BorderWidths(2))));
        centralHeatingOutline.setPrefWidth(300);
        centralHeatingOutline.setPrefHeight(184);
        Label labelCentralHeating = new Label("Central Heating");
        labelCentralHeating.setPadding(new Insets(5));
        labelCentralHeating.setFont(Font.font("Arial", FontWeight.BOLD, 13.5));
        labelCentralHeating.setTranslateY(-63.8);
        VBox radioButton = new VBox();
        radioButton.setSpacing(22);
        RadioButton btn1 = new RadioButton("Off");
        RadioButton btn2 = new RadioButton("Auto");
        RadioButton btn3 = new RadioButton("Once");
        RadioButton btn4 = new RadioButton("Cont");
        btn2.setSelected(true);
        radioButton.getChildren().addAll(btn1, btn2, btn3, btn4);
        radioButton.setTranslateX(13.5);
        radioButton.setTranslateY(25);
        Slider tempSlider = new Slider();
        tempSlider.setOrientation(Orientation.VERTICAL);
        tempSlider.setTranslateX(100);
        tempSlider.setTranslateY(25);
        tempSlider.setPrefHeight(150);
        DecimalFormat df = new DecimalFormat("#,#0.0" + " °C");
        final double MIN = 0d;
        final double MAX = 30d;
        tempSlider.setShowTickMarks(true);
        tempSlider.setMin(MIN);
        tempSlider.setMax(MAX);
        tempSlider.setMajorTickUnit(5);
        tempSlider.setMinorTickCount(1);
        tempSlider.setShowTickLabels(true);
        tempSlider.setValue(20);

        tempSlider.setLabelFormatter(new StringConverter<Double>() {

            @Override
            public String toString(Double object) {
                String numbers = df.format(object + MIN);
                return numbers;
            }

            @Override
            public Double fromString(String string) {
                throw new UnsupportedOperationException("Error");
            }

        });

        TextField textFieldTemp = new TextField();
        textFieldTemp.setMinWidth(70);
        textFieldTemp.setMaxWidth(65);
        textFieldTemp.setMinHeight(46);
        textFieldTemp.setMaxHeight(38);
        textFieldTemp.setTranslateX(190);
        textFieldTemp.setTranslateY(22);
        textFieldTemp.setFont(Font.font("Arial Black", 16.5));
        textFieldTemp.setText("20.0");
        Rectangle r = new Rectangle(57, 32);
        r.setWidth(62);
        r.setHeight(38);
        r.setStroke(Color.rgb(152, 152, 152));
        r.setStrokeWidth(2);
        r.setFill(Color.TRANSPARENT);
        r.setTranslateX(193);
        r.setTranslateY(22);
        r.setArcHeight(5);
        r.setArcWidth(5);

        btn1.setOnAction((ActionEvent e) -> {
            if (btn1.isSelected()) {
                btn2.setSelected(false);
                btn3.setSelected(false);
                btn4.setSelected(false);
            } else if (!btn1.isSelected()) {
                btn1.setSelected(true);
            }
        });

        btn2.setOnAction((ActionEvent e) -> {
            if (btn2.isSelected()) {
                btn1.setSelected(false);
                btn3.setSelected(false);
                btn4.setSelected(false);
            } else if (!btn2.isSelected()) {
                btn2.setSelected(true);
            }
        });

        btn3.setOnAction((ActionEvent e) -> {
            if (btn3.isSelected()) {
                btn1.setSelected(false);
                btn2.setSelected(false);
                btn4.setSelected(false);
            } else if (!btn3.isSelected()) {
                btn3.setSelected(true);
            }
        });

        btn4.setOnAction((ActionEvent e) -> {
            if (btn4.isSelected()) {
                btn1.setSelected(false);
                btn2.setSelected(false);
                btn3.setSelected(false);
            } else if (!btn4.isSelected()) {
                btn4.setSelected(true);
            }
        });

        tempSlider.setOnMouseDragged(e -> {
            double v = tempSlider.getValue();
            double roundedOneDigitX = Math.round(v * 10) / 10.0;
            String s = Double.toString(roundedOneDigitX);
            textFieldTemp.setText(s);
        });

        tempSlider.setOnMouseClicked(e -> {
            double v = tempSlider.getValue();
            double roundedOneDigitX = Math.round(v * 10) / 10.0;
            String s = Double.toString(roundedOneDigitX);
            textFieldTemp.setText(s);
        });

        centralHeatingOutline.getChildren().addAll(labelCentralHeating, radioButton, tempSlider, textFieldTemp, r);

        vbox.getChildren().addAll(lightingOutline, centralHeatingOutline);

        VBox vbox2 = new VBox();
        GridPane CCTVSectionOutline = new GridPane();
        CCTVSectionOutline.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        CCTVSectionOutline.setBorder(new Border(new BorderStroke(Color.DARKGRAY, BorderStrokeStyle.SOLID, new CornerRadii(4), new BorderWidths(2))));
        CCTVSectionOutline.setPrefWidth(500);
        CCTVSectionOutline.setPrefHeight(500);
        CCTVSectionOutline.setTranslateX(-15);
        Label labelOne = new Label("CCTV");
        labelOne.setPadding(new Insets(5));
        labelOne.setFont(Font.font("Arial", FontWeight.BOLD, 13.5));
        labelOne.setTranslateY(-68);
        HBox toogaleButton = new HBox(10);
        ToggleButton btnFront = new ToggleButton("Front");
        ToggleButton btnRear = new ToggleButton("Rear");
        ToggleButton btnSide = new ToggleButton("Side");
        ToggleButton btnDrive = new ToggleButton("Drive");
        toogaleButton.setTranslateY(400);
        toogaleButton.setTranslateX(112);
        toogaleButton.getChildren().addAll(btnFront, btnRear, btnSide, btnDrive);
        GridPane imgView1 = new GridPane();
        GridPane imgView2 = new GridPane();
        ImageView v1 = new ImageView();
        ImageView v2 = new ImageView();
        v1.setImage(front);
        v2.setImage(back);
        v1.setFitHeight(163);
        v1.setFitWidth(222);
        imgView1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1))));
        v2.setFitHeight(163);
        v2.setFitWidth(222);
        imgView1.setTranslateX(5.7);
        imgView1.setTranslateY(47);
        imgView1.setMaxWidth(0);
        imgView1.setMaxHeight(0);
        imgView1.getChildren().addAll(v1);
        imgView2.setTranslateX(232);  //Edit
        imgView2.setTranslateY(47);
        imgView2.setMaxWidth(0);
        imgView2.setMaxHeight(0);
        imgView2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1))));
        imgView2.getChildren().addAll(v2);
        GridPane imgView3 = new GridPane();
        GridPane imgView4 = new GridPane();
        ImageView v3 = new ImageView();
        ImageView v4 = new ImageView();
        v3.setImage(side);
        v4.setImage(drive);
        v3.setFitHeight(165);
        v3.setFitWidth(222);
        v4.setFitHeight(165);
        v4.setFitWidth(222);
        imgView3.setTranslateX(5.7);
        imgView3.setTranslateY(215);
        imgView3.setMaxWidth(0);
        imgView3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1))));
        imgView3.getChildren().addAll(v3);
        imgView4.setTranslateX(232);
        imgView4.setTranslateY(215);
        imgView4.setMaxWidth(0);
        imgView4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1))));
        imgView4.getChildren().addAll(v4);

        //Event Handlers for the Actions.
        btnFront.setOnAction((ActionEvent e) -> {
            if (btnFront.isSelected()) {
                v1.setImage(muteScreen);
            } else {
                v1.setImage(front);
            }
        });

        btnRear.setOnAction((ActionEvent e) -> {
            if (btnRear.isSelected()) {
                v2.setImage(muteScreen);
            } else {
                v2.setImage(back);
            }
        });

        btnSide.setOnAction((ActionEvent e) -> {
            if (btnSide.isSelected()) {
                v3.setImage(muteScreen);
            } else {
                v3.setImage(side);
            }
        });

        btnDrive.setOnAction((ActionEvent e) -> {
            if (btnDrive.isSelected()) {
                v4.setImage(muteScreen);
            } else {
                v4.setImage(drive);
            }
        });

        CCTVSectionOutline.getChildren().addAll(labelOne, toogaleButton, imgView1, imgView2, imgView3, imgView4);
        vbox2.getChildren().addAll(CCTVSectionOutline);

        hbox.setPadding(new Insets(5, -8, 5, 5));
        hbox.getChildren().addAll(vbox, vbox2);

        root.getChildren().add(hbox);
        Scene scene = new Scene(root, 760, 440);
        primaryStage.setResizable(false);
        primaryStage.setTitle("                                                                            SmartPad App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
