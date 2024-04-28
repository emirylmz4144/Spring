package ValueInjectionTraining.Classes;

import java.util.*;

public class ValueBean {
	private int i;
	private int j;
	private double d;
	private boolean b;
	private String s1;
	private String s2;
	private int[] array;
	private List<String> list;
	private Set<Integer> set;
	private Map<Integer, String> map;

	public ValueBean() {
		System.out.println("\n==> ValueBean()");
	}

	public ValueBean(int i, int j, double d, boolean b, String s1, String s2) {
		System.out.println("\n==> ValueBean(int i, int j, double d, boolean b, String s1, String s2)");
		this.i = i;
		this.j = j;
		this.d = d;
		this.b = b;
		this.s1 = s1;
		this.s2 = s2;
	}

	public ValueBean(int i, int j, double d, boolean b, String s1, String s2, int[] array) {
		System.out.println("\n==> ValueBean(int i, int j, double d, boolean b, String s1, String s2, int[] array)");
		this.i = i;
		this.j = j;
		this.d = d;
		this.b = b;
		this.s1 = s1;
		this.s2 = s2;
		this.array = array;
	}

	public ValueBean(int i, int j, double d, boolean b, String s1, String s2, List<String> list) {
		System.out.println("\n==> ValueBean(int i, int j, double d, boolean b, String s1, String s2, List<String> list)");
		this.i = i;
		this.j = j;
		this.d = d;
		this.b = b;
		this.s1 = s1;
		this.s2 = s2;
		this.list = list;
	}

	public ValueBean(int i, int j, double d, boolean b, String s1, String s2, List<String> list, Set<Integer> set) {
		System.out.println("\n==> ValueBean(int i, int j, double d, boolean b, String s1, String s2, List<String> list, Set<Integer> set)");
		this.i = i;
		this.j = j;
		this.d = d;
		this.b = b;
		this.s1 = s1;
		this.s2 = s2;
		this.list = list;
		this.set = set;
	}

	public ValueBean(int i, int j, double d, boolean b, String s1, String s2, List<String> list, Set<Integer> set, Map<Integer, String> map) {
		System.out.println(
				"\n==> ValueBean(int i, int j, double d, boolean b, String s1, String s2, List<String> list, Set<Integer> set, Map<Integer, String> map)");
		this.i = i;
		this.j = j;
		this.d = d;
		this.b = b;
		this.s1 = s1;
		this.s2 = s2;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ValueBean [i=" + i + ", j=" + j + ", d=" + d + ", b=" + b + ", s1=" + s1 + ", s2=" + s2 + ", array=" + Arrays.toString(array)
				+ ", list=" + list + ", set=" + set + ", map=" + map + "]";
	}
}
