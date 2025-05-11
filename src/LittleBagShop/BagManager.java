/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LittleBagShop;

import java.io.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class BagManager {
    private static final String FILE_NAME = "bags.txt";

    public ArrayList<Bag> loadBags() {
        ArrayList<Bag> bags = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bagDetails = line.split(",");
                if (bagDetails.length == 4) {
                    bags.add(new Bag(bagDetails[0], bagDetails[1], bagDetails[2], bagDetails[3]));
                } else {
                    System.out.println("Skipping malformed line: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bags;
    }

    public void saveBags(ArrayList<Bag> bags) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Bag bag : bags) {
                bw.write(bag.getBagID() + "," + bag.getBagBrand() + "," + bag.getCategory() + "," + bag.getBagPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteBag(String bagID) {
        ArrayList<Bag> bags = loadBags();
        bags.removeIf(bag -> bag.getBagID().equals(bagID));
        saveBags(bags);
    }

    public void updateBag(Bag updatedBag) {
        ArrayList<Bag> bags = loadBags();
        for (int i = 0; i < bags.size(); i++) {
            if (bags.get(i).getBagID().equals(updatedBag.getBagID())) {
                bags.set(i, updatedBag);
                break;
            }
        }
        saveBags(bags);
    }
}
