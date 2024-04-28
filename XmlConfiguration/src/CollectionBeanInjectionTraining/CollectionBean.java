package CollectionBeanInjectionTraining;

import java.util.*;

import CollectionBeanInjectionTraining.Classes.BeanA;
import CollectionBeanInjectionTraining.Classes.BeanB;
import CollectionBeanInjectionTraining.Classes.BeanC;


public class CollectionBean {
	private BeanA[] array;
	private List<BeanB> list;
	private Set<BeanC> set;
	private Map<Integer, BeanA> map1;
	private Map<Integer, BeanA> map2;
	private Map<BeanA, BeanB> map3;
	
	public CollectionBean() {
		System.out.println("\n==> CollectionBean()");
	}

	public CollectionBean(BeanA[] array, List<BeanB> list, Set<BeanC> set, Map<Integer, BeanA> map1, Map<Integer, BeanA> map2, Map<BeanA, BeanB> map3) {
		System.out.println("\n==> CollectionBean(BeanA[] array, List<BeanB> list, Set<BeanC> set, Map<Integer, BeanA> map1, Map<Integer, BeanA> map2), Map<Integer, BeanA> map3");
		this.array = array;
		this.list = list;
		this.set = set;
		this.map1 = map1;
		this.map2 = map2;
		this.map3 = map3;
	}

	@Override
	public String toString() {
		return "CollectionBean [array=" + Arrays.toString(array) + ", list=" + list + ", set=" + set + ", map1=" + map1 + ", map2=" + map2
				+ ", map3=" + map3 + "]";
	}
}
