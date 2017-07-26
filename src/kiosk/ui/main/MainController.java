package kiosk.ui.main;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.effects.JFXDepthManager;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import kiosk.database.DatabaseHandler;

public class MainController implements Initializable {

   // burger
   @FXML
   private ImageView burger001img;
   @FXML
   private ImageView burger002img;
   @FXML
   private ImageView burger003img;
   @FXML
   private ImageView burger004img;
   @FXML
   private ImageView burger005img;
   @FXML
   private ImageView burger006img;
   @FXML
   private JFXButton burger001add;
   @FXML
   private JFXButton burger002add;
   @FXML
   private JFXButton burger003add;
   @FXML
   private JFXButton burger004add;
   @FXML
   private JFXButton burger005add;
   @FXML
   private JFXButton burger006add;
   @FXML
   private Label burger001count;
   @FXML
   private Label burger002count;
   @FXML
   private Label burger003count;
   @FXML
   private Label burger004count;
   @FXML
   private Label burger005count;
   @FXML
   private Label burger006count;
   @FXML
   private JFXButton burger001remove;
   @FXML
   private JFXButton burger002remove;
   @FXML
   private JFXButton burger003remove;
   @FXML
   private JFXButton burger004remove;
   @FXML
   private JFXButton burger005remove;
   @FXML
   private JFXButton burger006remove;

   // salad
   @FXML
   private ImageView salad001img;
   @FXML
   private ImageView salad002img;
   @FXML
   private ImageView salad003img;
   @FXML
   private ImageView salad004img;
   @FXML
   private ImageView salad005img;
   @FXML
   private JFXButton salad001add;
   @FXML
   private JFXButton salad002add;
   @FXML
   private JFXButton salad003add;
   @FXML
   private JFXButton salad004add;
   @FXML
   private JFXButton salad005add;
   @FXML
   private Label salad001count;
   @FXML
   private Label salad002count;
   @FXML
   private Label salad003count;
   @FXML
   private Label salad004count;
   @FXML
   private Label salad005count;
   @FXML
   private JFXButton salad001remove;
   @FXML
   private JFXButton salad002remove;
   @FXML
   private JFXButton salad003remove;
   @FXML
   private JFXButton salad004remove;
   @FXML
   private JFXButton salad005remove;

   // side
   @FXML
   private ImageView side001img;
   @FXML
   private ImageView side002img;
   @FXML
   private ImageView side003img;
   @FXML
   private ImageView side004img;
   @FXML
   private ImageView side005img;
   @FXML
   private JFXButton side001add;
   @FXML
   private JFXButton side002add;
   @FXML
   private JFXButton side003add;
   @FXML
   private JFXButton side004add;
   @FXML
   private JFXButton side005add;
   @FXML
   private Label side001count;
   @FXML
   private Label side002count;
   @FXML
   private Label side003count;
   @FXML
   private Label side004count;
   @FXML
   private Label side005count;
   @FXML
   private JFXButton side001remove;
   @FXML
   private JFXButton side002remove;
   @FXML
   private JFXButton side003remove;
   @FXML
   private JFXButton side004remove;
   @FXML
   private JFXButton side005remove;

   // dessert
   @FXML
   private ImageView dessert001img;
   @FXML
   private ImageView dessert002img;
   @FXML
   private ImageView dessert003img;
   @FXML
   private ImageView dessert004img;
   @FXML
   private ImageView dessert005img;
   @FXML
   private ImageView dessert006img;
   @FXML
   private JFXButton dessert001add;
   @FXML
   private JFXButton dessert002add;
   @FXML
   private JFXButton dessert003add;
   @FXML
   private JFXButton dessert004add;
   @FXML
   private JFXButton dessert005add;
   @FXML
   private JFXButton dessert006add;
   @FXML
   private Label dessert001count;
   @FXML
   private Label dessert002count;
   @FXML
   private Label dessert003count;
   @FXML
   private Label dessert004count;
   @FXML
   private Label dessert005count;
   @FXML
   private Label dessert006count;
   @FXML
   private JFXButton dessert001remove;
   @FXML
   private JFXButton dessert002remove;
   @FXML
   private JFXButton dessert003remove;
   @FXML
   private JFXButton dessert004remove;
   @FXML
   private JFXButton dessert005remove;
   @FXML
   private JFXButton dessert006remove;

   // drink
   @FXML
   private ImageView drink001img;
   @FXML
   private ImageView drink002img;
   @FXML
   private ImageView drink003img;
   @FXML
   private ImageView drink004img;
   @FXML
   private ImageView drink005img;
   @FXML
   private ImageView drink006img;
   @FXML
   private JFXButton drink001add;
   @FXML
   private JFXButton drink002add;
   @FXML
   private JFXButton drink003add;
   @FXML
   private JFXButton drink004add;
   @FXML
   private JFXButton drink005add;
   @FXML
   private JFXButton drink006add;
   @FXML
   private Label drink001count;
   @FXML
   private Label drink002count;
   @FXML
   private Label drink003count;
   @FXML
   private Label drink004count;
   @FXML
   private Label drink005count;
   @FXML
   private Label drink006count;
   @FXML
   private JFXButton drink001remove;
   @FXML
   private JFXButton drink002remove;
   @FXML
   private JFXButton drink003remove;
   @FXML
   private JFXButton drink004remove;
   @FXML
   private JFXButton drink005remove;
   @FXML
   private JFXButton drink006remove;

   @FXML
   private JFXListView<String> myOrder;

   @FXML
   private JFXButton cancelOrder;

   @FXML
   private JFXButton done;

   @FXML
   private JFXButton adminButton;

   private static DatabaseHandler databaseHandler;
   private ArrayList<Order> orderList;
   private static HashMap<String, Order> orderMap;
   private static ObservableMap<String, String> countMap;

   @FXML
   void loadOrderTableView(ActionEvent event) {
      String loc = "/kiosk/ui/listorder/listorder.fxml";
      String title = "Order Info";

      try {
         Parent parent = FXMLLoader.load(getClass().getResource(loc));

         Stage stage = new Stage(StageStyle.DECORATED);
         parent.getStylesheets().add(getClass().getResource("../listorder/listorder.css").toString());
         stage.setTitle(title);

         stage.setScene(new Scene((parent)));
         stage.show();

      } catch (IOException ex) {
         Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

   @FXML
   void loadCancelOrderOp(ActionEvent event) {
      clearOrder();
   }

   @FXML
   void loadDoneOp(ActionEvent event) {

      if (orderList.size() == 0) {
         System.out.println("Please add items for order");
            return;
      }
      System.out.println(orderList.size());

      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
      LocalDateTime now = LocalDateTime.now();
      Timestamp timestamp = Timestamp.valueOf(now);
      for (Order orderItem : orderList) {
         String qu = "INSERT INTO ORDER_TABLE(orderID, menuID, name, price, count, orderedTime) VALUES (" +
             "'" + dtf.format(now) + "'," +
             "'" + orderItem.getId() + "'," +
             "'" + orderItem.getName() + "'," +
             "'" + orderItem.getPrice() + "'," +
             "'" + countMap.get(orderItem.getId()) + "'," +
             "'" + timestamp + "'" +
             ")";
         System.out.print(qu);
         if (databaseHandler.execAction(qu)) {
            System.out.println(" - OK");
         } else {
            System.out.println(" - FAIL");
         }

      }

      String qu = "SELECT * FROM ORDER_TABLE";
      ResultSet rs = databaseHandler.execQuery(qu);
      System.out.println(qu);
      try {
         while (rs.next()) {
            String id = rs.getString("uid");
            String orderID = rs.getString("orderID");
            String menuID = rs.getString("menuID");
            String name = rs.getString("name");
            String price = rs.getString("price");
            String count = rs.getString("count");
            Timestamp orderedTime = rs.getTimestamp("orderedTime");
            System.out.println("id: " + id);
            System.out.println("orderID: " + orderID);
            System.out.println("menuID: " + menuID);
            System.out.println("name: " + name);
            System.out.println("price: " + price);
            System.out.println("count: " + count);
            System.out.println("Time: " + orderedTime.toString());
         }
      } catch (SQLException ex) {
         ex.printStackTrace();
      }

      clearOrder();

      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setHeaderText(null);
      alert.setContentText("Order Success");
      alert.showAndWait();

   }

   public void clearOrder() {
      for (String key : countMap.keySet()) {
         countMap.put(key, "0");
      }
      orderList.clear();
      myOrder.getItems().clear();

   }

   public static void lateInit() {
      if (DatabaseHandler.shouldInitDB()) {
         addMenuItemAllToDB();
      }
      setDataFromDB();
   }

   @Override
   public void initialize(URL location, ResourceBundle resources) {

      orderMap = new HashMap<>();
      orderList = new ArrayList<>();
      countMap = FXCollections.observableHashMap();

      // burger
      JFXDepthManager.setDepth(burger001img, 1);
      JFXDepthManager.setDepth(burger002img, 1);
      JFXDepthManager.setDepth(burger003img, 1);
      JFXDepthManager.setDepth(burger004img, 1);
      JFXDepthManager.setDepth(burger005img, 1);
      JFXDepthManager.setDepth(burger006img, 1);
      burger001add.setOnAction(e -> increaseCount("burger001"));
      burger002add.setOnAction(e -> increaseCount("burger002"));
      burger003add.setOnAction(e -> increaseCount("burger003"));
      burger004add.setOnAction(e -> increaseCount("burger004"));
      burger005add.setOnAction(e -> increaseCount("burger005"));
      burger006add.setOnAction(e -> increaseCount("burger006"));
      burger001remove.setOnAction(e -> decreaseCount("burger001"));
      burger002remove.setOnAction(e -> decreaseCount("burger002"));
      burger003remove.setOnAction(e -> decreaseCount("burger003"));
      burger004remove.setOnAction(e -> decreaseCount("burger004"));
      burger005remove.setOnAction(e -> decreaseCount("burger005"));
      burger006remove.setOnAction(e -> decreaseCount("burger006"));
      burger001count.textProperty().bind(Bindings.valueAt(countMap, "burger001"));
      burger002count.textProperty().bind(Bindings.valueAt(countMap, "burger002"));
      burger003count.textProperty().bind(Bindings.valueAt(countMap, "burger003"));
      burger004count.textProperty().bind(Bindings.valueAt(countMap, "burger004"));
      burger005count.textProperty().bind(Bindings.valueAt(countMap, "burger005"));
      burger006count.textProperty().bind(Bindings.valueAt(countMap, "burger006"));

      // salad
      JFXDepthManager.setDepth(salad001img, 1);
      JFXDepthManager.setDepth(salad002img, 1);
      JFXDepthManager.setDepth(salad003img, 1);
      JFXDepthManager.setDepth(salad004img, 1);
      JFXDepthManager.setDepth(salad005img, 1);
      salad001add.setOnAction(e -> increaseCount("salad001"));
      salad002add.setOnAction(e -> increaseCount("salad002"));
      salad003add.setOnAction(e -> increaseCount("salad003"));
      salad004add.setOnAction(e -> increaseCount("salad004"));
      salad005add.setOnAction(e -> increaseCount("salad005"));
      salad001remove.setOnAction(e -> decreaseCount("salad001"));
      salad002remove.setOnAction(e -> decreaseCount("salad002"));
      salad003remove.setOnAction(e -> decreaseCount("salad003"));
      salad004remove.setOnAction(e -> decreaseCount("salad004"));
      salad005remove.setOnAction(e -> decreaseCount("salad005"));
      salad001count.textProperty().bind(Bindings.valueAt(countMap, "salad001"));
      salad002count.textProperty().bind(Bindings.valueAt(countMap, "salad002"));
      salad003count.textProperty().bind(Bindings.valueAt(countMap, "salad003"));
      salad004count.textProperty().bind(Bindings.valueAt(countMap, "salad004"));
      salad005count.textProperty().bind(Bindings.valueAt(countMap, "salad005"));

      // side
      JFXDepthManager.setDepth(side001img, 1);
      JFXDepthManager.setDepth(side002img, 1);
      JFXDepthManager.setDepth(side003img, 1);
      JFXDepthManager.setDepth(side004img, 1);
      JFXDepthManager.setDepth(side005img, 1);
      side001add.setOnAction(e -> increaseCount("side001"));
      side002add.setOnAction(e -> increaseCount("side002"));
      side003add.setOnAction(e -> increaseCount("side003"));
      side004add.setOnAction(e -> increaseCount("side004"));
      side005add.setOnAction(e -> increaseCount("side005"));
      side001remove.setOnAction(e -> decreaseCount("side001"));
      side002remove.setOnAction(e -> decreaseCount("side002"));
      side003remove.setOnAction(e -> decreaseCount("side003"));
      side004remove.setOnAction(e -> decreaseCount("side004"));
      side005remove.setOnAction(e -> decreaseCount("side005"));
      side001count.textProperty().bind(Bindings.valueAt(countMap, "side001"));
      side002count.textProperty().bind(Bindings.valueAt(countMap, "side002"));
      side003count.textProperty().bind(Bindings.valueAt(countMap, "side003"));
      side004count.textProperty().bind(Bindings.valueAt(countMap, "side004"));
      side005count.textProperty().bind(Bindings.valueAt(countMap, "side005"));

      // dessert
      JFXDepthManager.setDepth(dessert001img, 1);
      JFXDepthManager.setDepth(dessert002img, 1);
      JFXDepthManager.setDepth(dessert003img, 1);
      JFXDepthManager.setDepth(dessert004img, 1);
      JFXDepthManager.setDepth(dessert005img, 1);
      JFXDepthManager.setDepth(dessert006img, 1);
      dessert001add.setOnAction(e -> increaseCount("dessert001"));
      dessert002add.setOnAction(e -> increaseCount("dessert002"));
      dessert003add.setOnAction(e -> increaseCount("dessert003"));
      dessert004add.setOnAction(e -> increaseCount("dessert004"));
      dessert005add.setOnAction(e -> increaseCount("dessert005"));
      dessert006add.setOnAction(e -> increaseCount("dessert006"));
      dessert001remove.setOnAction(e -> decreaseCount("dessert001"));
      dessert002remove.setOnAction(e -> decreaseCount("dessert002"));
      dessert003remove.setOnAction(e -> decreaseCount("dessert003"));
      dessert004remove.setOnAction(e -> decreaseCount("dessert004"));
      dessert005remove.setOnAction(e -> decreaseCount("dessert005"));
      dessert006remove.setOnAction(e -> decreaseCount("dessert006"));
      dessert001count.textProperty().bind(Bindings.valueAt(countMap, "dessert001"));
      dessert002count.textProperty().bind(Bindings.valueAt(countMap, "dessert002"));
      dessert003count.textProperty().bind(Bindings.valueAt(countMap, "dessert003"));
      dessert004count.textProperty().bind(Bindings.valueAt(countMap, "dessert004"));
      dessert005count.textProperty().bind(Bindings.valueAt(countMap, "dessert005"));
      dessert006count.textProperty().bind(Bindings.valueAt(countMap, "dessert006"));

      // drink
      JFXDepthManager.setDepth(drink001img, 1);
      JFXDepthManager.setDepth(drink002img, 1);
      JFXDepthManager.setDepth(drink003img, 1);
      JFXDepthManager.setDepth(drink004img, 1);
      JFXDepthManager.setDepth(drink005img, 1);
      JFXDepthManager.setDepth(drink006img, 1);
      drink001add.setOnAction(e -> increaseCount("drink001"));
      drink002add.setOnAction(e -> increaseCount("drink002"));
      drink003add.setOnAction(e -> increaseCount("drink003"));
      drink004add.setOnAction(e -> increaseCount("drink004"));
      drink005add.setOnAction(e -> increaseCount("drink005"));
      drink006add.setOnAction(e -> increaseCount("drink006"));
      drink001remove.setOnAction(e -> decreaseCount("drink001"));
      drink002remove.setOnAction(e -> decreaseCount("drink002"));
      drink003remove.setOnAction(e -> decreaseCount("drink003"));
      drink004remove.setOnAction(e -> decreaseCount("drink004"));
      drink005remove.setOnAction(e -> decreaseCount("drink005"));
      drink006remove.setOnAction(e -> decreaseCount("drink006"));
      drink001count.textProperty().bind(Bindings.valueAt(countMap, "drink001"));
      drink002count.textProperty().bind(Bindings.valueAt(countMap, "drink002"));
      drink003count.textProperty().bind(Bindings.valueAt(countMap, "drink003"));
      drink004count.textProperty().bind(Bindings.valueAt(countMap, "drink004"));
      drink005count.textProperty().bind(Bindings.valueAt(countMap, "drink005"));
      drink006count.textProperty().bind(Bindings.valueAt(countMap, "drink006"));
   }

   public static class Order {

      private String id;
      private String name;
      private double price;
      private int count;

      public Order(String id, String name, double price, int count) {
         this.id = id;
         this.name = name;
         this.price = price;
         this.count = count;
      }

      public String getId() {
         return id;
      }

      public String getName() {
         return name;
      }

      public double getPrice() {
         return price;
      }

      public int getCount() {
         return count;
      }

      @Override
      public boolean equals(Object obj) {
         if (obj == null) {
            return false;
         }

         if(!(obj instanceof Order)) {
            return false;
         }
         Order other = (Order)obj;
         if (((this.getId()).equals(other.getId())) &&
                 ((this.getName()).equals(other.getName())) &&
                 ((this.getPrice() == this.getPrice()))) {
            return true;
         }
         return false;
      }
   }


   public void decreaseCount(String id) {
      int count = Integer.parseInt(countMap.get(id));

      if (count == 0) {
         return;
      }

      Order order = orderMap.get(id);
      Order newOrder = new Order(id, order.getName(), order.getPrice(), --count);
      countMap.put(id, count + "");

      if (count == 0) {
         orderList.remove(orderList.indexOf(order));
      } else {
         orderList.set(orderList.indexOf(order), newOrder);
      }
      reRenderList();
   }

   public void increaseCount(String id) {
      Order order = orderMap.get(id);
      int count = Integer.parseInt(countMap.get(id));

      Order newOrder = new Order(id, order.getName(), order.getPrice(), ++count);
      countMap.put(id, count + "");

      if (count == 1) {
         // new item
         orderList.add(newOrder);
      } else {
         // more than one item
         orderList.set(orderList.indexOf(order), newOrder);
      }
      reRenderList();
   }

   void reRenderList () {
      myOrder.getItems().clear();
      ObservableList<String> orderData = FXCollections.observableArrayList();
      BigDecimal sum = new BigDecimal(0);
      BigDecimal price;
      BigDecimal count;
      for (Order orderItem : orderList) {
         price = new BigDecimal(orderItem.getPrice() + "");
         count = new BigDecimal(orderItem.getCount() + "");
         orderData.add(String.format("%2d %-28.28s %2.2f",
             count.intValue(),
             orderItem.getName(),
             price.doubleValue()));
         sum = sum.add(price.multiply(count));
      }

      if (orderList.size() > 0) {
         orderData.add("=====================================");
         orderData.add("Sum: " + sum.doubleValue());
      }
      myOrder.getItems().addAll(orderData);
   }

   private static void setDataFromDB() {
      databaseHandler = DatabaseHandler.getInstance();
      String qu = "SELECT * FROM MENU";
      ResultSet rs = databaseHandler.execQuery(qu);
      System.out.println(qu);
      try {
         while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            double price = Double.parseDouble(rs.getString("price"));
            orderMap.put(id, new Order(id, name, price, 0));
            countMap.put(id, "0");
         }
      } catch (SQLException ex) {
         ex.printStackTrace();
      }

   }

   private static void addMenuItemAllToDB() {
      addMenuItemToDB("burger001", "Big Mac", "3.99");
      addMenuItemToDB("burger002", "McDouble", "1.39");
      addMenuItemToDB("burger003", "Double Quarter Pounder with Cheese", "4.79");
      addMenuItemToDB("burger004", "Quarter Pounder with Cheese", "3.79");
      addMenuItemToDB("burger005", "Double Cheeseburger", "1.69");
      addMenuItemToDB("burger006", "Cheeseburger", "1.00");
      addMenuItemToDB("salad001", "Bacon Ranch Salad with Buttermilk Crispy Chicken", "4.59");
      addMenuItemToDB("salad002", "Bacon Ranch Salad with Grilled Chicken", "4.59");
      addMenuItemToDB("salad003", "Side Salad", "1.59");
      addMenuItemToDB("salad004", "Southwest Salad with Buttermilk Crispy Chicken", "4.79");
      addMenuItemToDB("salad005", "Southwest Salad with Grilled Chicken", "4.79");
      addMenuItemToDB("side001", "Apple Slices", "1.00");
      addMenuItemToDB("side002", "Cuties", "1.00");
      addMenuItemToDB("side003", "French Fries", "1.79");
      addMenuItemToDB("side004", "Fruit n Yogurt Parfait", "1.00");
      addMenuItemToDB("side005", "Go GURT Strawberry Yogurt Tube", "1.00");
      addMenuItemToDB("dessert001", "Baked Hot Apple Pie", "0.99");
      addMenuItemToDB("dessert002", "Chocolate Chip Cookie", "0.39");
      addMenuItemToDB("dessert003", "McFlurry with OREO Cookies", "2.39");
      addMenuItemToDB("dessert004", "Strawberry Sundae", "1.29");
      addMenuItemToDB("dessert005", "Vanilla Ice Cream Cone", "1.00");
      addMenuItemToDB("dessert006", "Vanilla McCafe Shake", "2.59");
      addMenuItemToDB("drink001", "Coca Cola", "1.29");
      addMenuItemToDB("drink002", "Coffee", "0.90");
      addMenuItemToDB("drink003", "Dasani Water", "1.00");
      addMenuItemToDB("drink004", "McCafe Mocha", "2.39");
      addMenuItemToDB("drink005", "Minute Maid Apple Juice", "1.00");
      addMenuItemToDB("drink006", "Sprite", "1.29");
   }

   private static void addMenuItemToDB(String id, String name, String price) {
      databaseHandler = DatabaseHandler.getInstance();

      String qu = "INSERT INTO MENU VALUES (" +
          "'" + id + "'," +
          "'" + name + "'," +
          "'" + price + "')";
      System.out.print(qu);
      if (databaseHandler.execAction(qu)) {
         System.out.println(" --- OK");
      } else {
         System.out.println(" --- FAIL");
      }

   }
}
