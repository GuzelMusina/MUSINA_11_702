package ru.itis;

import ru.itis.models.Line;
import ru.itis.models.Point;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 02.12.2017
 * Finder
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Finder {
    public Finder() {

    }

    public LinkedList<Line> findLines(LinkedList<Point> points, LinkedList<Line> lines, BufferedWriter writer) throws Exception {
        for (int i = 0; i < points.size();) {
            lines.add(new Line());
            lines.getLast().addPoint(points.get(0));
            writer.write(lines.getLast().lastPointInList().getX() + "" + lines.getLast().lastPointInList().getY() + "  ");
            points.remove(0);

            for (int j = 0; j < points.size(); j++) {
                if (lines.getLast().lastPointInList().getX() <= points.get(j).getX() &&
                        lines.getLast().lastPointInList().getY() <= points.get(j).getY()) {
                    lines.getLast().addPoint(points.get(j));
                    writer.write(lines.getLast().lastPointInList().getX() + "" + lines.getLast().lastPointInList().getY() + "  ");
                    points.remove(j);
                    j--;
                }
            }
            writer.write("\n");
        }return lines;
    }
}

