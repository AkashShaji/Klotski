package tests;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JOptionPane;

public class Fakes {

	public class FakeGraphics extends Graphics{
		
		FakeGraphics(){}

		@Override
		public void clearRect(int x, int y, int width, int height) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void clipRect(int x, int y, int width, int height) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void copyArea(int x, int y, int width, int height, int dx, int dy) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Graphics create() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor,
				ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
				ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
				Color bgcolor, ImageObserver observer) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void drawLine(int x1, int y1, int x2, int y2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void drawOval(int x, int y, int width, int height) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void drawString(String str, int x, int y) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void drawString(AttributedCharacterIterator iterator, int x, int y) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void fillOval(int x, int y, int width, int height) {			
		}

		@Override
		public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {			
		}

		@Override
		public void fillRect(int x, int y, int width, int height) {			
		}

		@Override
		public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {			
		}

		@Override
		public Shape getClip() {
			return null;
		}

		@Override
		public Rectangle getClipBounds() {
			return null;
		}

		@Override
		public Color getColor() {
			return null;
		}

		@Override
		public Font getFont() {
			return null;
		}

		@Override
		public FontMetrics getFontMetrics(Font f) {
			return null;
		}

		@Override
		public void setClip(Shape clip) {			
		}

		@Override
		public void setClip(int x, int y, int width, int height) {			
		}

		@Override
		public void setColor(Color c) {			
		}

		@Override
		public void setFont(Font font) {			
		}

		@Override
		public void setPaintMode() {			
		}

		@Override
		public void setXORMode(Color c1) {			
		}

		@Override
		public void translate(int x, int y) {		
		}
		
		
		
	}
}
