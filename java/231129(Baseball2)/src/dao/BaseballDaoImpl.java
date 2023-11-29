package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.BatterDto;
import dto.HumanDto;
import dto.PitcherDto;
import file.DataProc;

public class BaseballDaoImpl implements BaseballDao{
	
	Scanner sc = new Scanner(System.in);
		
//	private HumanDto human[];	
//	private HumanDto human[] = {
//		new PitcherDto(1001, "홍길동", 24, 172.1, "투수", 10, 3, 0.234),
//		new BatterDto(1002, "성춘향", 16, 157.3, "타자", 15, 5, 0.312),
//		new BatterDto(1003, "일지매", 22, 181.8, "타자", 9, 2, 0.226),
//		new BatterDto(1004, "홍길동", 26, 191.6, "타자", 20, 6, 0.253),
//		new PitcherDto(1005, "홍두께", 25, 175.2, "투수", 9, 6, 0.356),
//		new PitcherDto(1006, "임꺽정", 27, 188.4, "투수", 12, 5, 0.412),
//	};
	
//	private int counter;
	
	private List<HumanDto> Humanlist = new ArrayList<HumanDto>();
		
	DataProc dataProc;
	
	public BaseballDaoImpl() {
	//	human = new HumanDto[10];
	//	counter = 0;
		
		dataProc = new DataProc("baseball");
		dataProc.createFile();
	}	
	
	@Override
	public void insert() {
		System.out.println("선수등록입니다");
		System.out.println("등록할 포지션을 입력해 주세요");
		System.out.print("투수(1)/타자(2) = ");
		int position = sc.nextInt();
		
		System.out.print("번호 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		HumanDto humanDto = null;
		if(position == 1) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			humanDto = new PitcherDto(number, name, age, height, "투수", win, lose, defence);			
		}else {
			System.out.print("타수 = ");
			int batCount = sc.nextInt();
			
			System.out.print("히트수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			humanDto = new BatterDto(number, name, age, height, "타자", batCount, hit, hitAvg);			
		}		
		
//		human[counter] = humanDto;
//		counter++;
		Humanlist.add(humanDto);
		
		System.out.println("등록되었습니다");
	}

	@Override
	public void delete() {		
		System.out.println("선수삭제입니다");
		System.out.print("삭제할 선수의 이름 = ");
		String name = sc.next();
		
		int index = search(name);		
		if(index == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		
	//	human[index] = null;
	/*	
		human[index].setNumber(0);
		human[index].setName("");
		human[index].setAge(0);
		human[index].setHeight(0.0);
		
		if(human[index] instanceof PitcherDto) {
			PitcherDto p = (PitcherDto)human[index];
			p.setPosition("");
			p.setWin(0);
			p.setLose(0);
			p.setDefence(0.0);
		}else {
			BatterDto b = (BatterDto)human[index];
			b.setPosition("");
			b.setBatCount(0);
			b.setHit(0);			
			b.setHitAvg(0.0);
		}				
		*/
		Humanlist.remove(index);
		
		System.out.println("삭제되었습니다"); 
	}

	@Override
	public void select() {
		System.out.println("선수검색입니다");
		System.out.print("검색할 선수의 이름 = ");
		String name = sc.next();
		
		// 검색된 선수를 카운트
		/*
		int count = 0;
		for (int i = 0; i < human.length; i++) {
			HumanDto h = human[i];
			if(h != null && !h.getName().equals("")) {
				if(name.equals(h.getName())) {
					count++;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("선수 명단에 없습니다");
			return;
		}		
				
		// 1명이상일 경우 배열을 확보
		HumanDto findHuman[] = new HumanDto[count];
		int c = 0;
		for (int i = 0; i < human.length; i++) {
			HumanDto h = human[i];
			if(h != null && !h.getName().equals("")) {
				if(name.equals(h.getName())) {
					findHuman[c] = human[i];
					c++;
				}
			}
		}
		*/
		
		// index들
		List<Integer> list = searchAll(name);
		
		if(list.size() == 0) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		
		System.out.println("검색된 선수 명단입니다");
//		for (int i = 0; i < findHuman.length; i++) {
//			System.out.println(findHuman[i].info());
//		}
		
		for (int i = 0; i < list.size(); i++) {
			HumanDto dto = Humanlist.get(list.get(i));
			System.out.println(dto.info());
		}		
	}

	@Override
	public void update() {		
		System.out.println("선수수정입니다");
		System.out.print("수정할 선수의 이름 = ");
		String name = sc.next();
		
		int index = this.search(name);
		
		if(index == -1) {
			System.out.println("선수명단에 없습니다");
			return;
		}
		
		HumanDto dto = Humanlist.get(index);
		if(dto instanceof PitcherDto) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
//			PitcherDto p = (PitcherDto)human[index];
//			p.setWin(win);
//			p.setLose(lose);
//			p.setDefence(defence);			
			
			PitcherDto p = (PitcherDto)dto;
			p.setWin(win);
			p.setLose(lose);
			p.setDefence(defence);	
		}
		else {
			System.out.print("타수 = ");
			int batCount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
		//	BatterDto b = (BatterDto)human[index];			
			BatterDto b = (BatterDto)dto;
			
			b.setBatCount(batCount);
			b.setHit(hit);
			b.setHitAvg(hitAvg);
		}		
		
		System.out.println("수정되었습니다");
	}

	@Override
	public void allPrint() {
//		for (HumanDto h : human) {
//			if(h != null && !h.getName().equals("")) {
//				System.out.println(h.info());
//			}
//		}		
		
		for (HumanDto h : Humanlist) {
			System.out.println(h.info());
		}
	}

	@Override
	public void batSort() {	// 타율순위
		
//		HumanDto humanB[] = new HumanDto[10];
		List<BatterDto> batlist = new ArrayList<BatterDto>();
		
		// 타자만으로 (배열)구성
//		int count = 0;
//		for (int i = 0; i < human.length; i++) {
//			HumanDto h = human[i];
//			if(h != null && h.getName().equals("") == false) {
//				if(h instanceof BatterDto) {
//					humanB[count] = h;
//					count++;
//				}
//			}
//		}		
		// 타자만으로 (리스트)구성
		for (int i = 0; i < Humanlist.size(); i++) {
			HumanDto dto = Humanlist.get(i);
			if(dto instanceof BatterDto) {
				batlist.add((BatterDto)dto);
			}
		}
		
		if(batlist.size() < 2) {
			System.out.println("선수가 1명이거나 순위를 정할 수 없습니다");
			return;
		}
				
		// 순위(내림정렬)처리
		/*
		HumanDto temp;
		for (int i = 0; i < humanB.length - 1; i++) {
			for (int j = i + 1; j < humanB.length; j++) {
				
				if(humanB[i] != null && !humanB[i].getName().equals("") 
						&& humanB[j] != null && !humanB[j].getName().equals("")) {
					
					BatterDto b1 = (BatterDto)humanB[i];
					BatterDto b2 = (BatterDto)humanB[j];
					
					if(b1.getHitAvg() < b2.getHitAvg()) {	// 비교는 타율로 한다
						temp = humanB[i];
						humanB[i] = humanB[j];
						humanB[j] = temp;
					}
				}
			}
		}		
		*/		
		BatterDto temp = null;
		for (int i = 0; i < batlist.size()-1 ; i++) {
			for (int j = i+1; j < batlist.size(); j++) {
				
				BatterDto b1 = batlist.get(i);
				BatterDto b2 = batlist.get(j);
				
				if(b1.getHitAvg() < b2.getHitAvg()) {	// 내림차순
//					temp = batlist.get(i);
//					batlist.get(i) = batlist.get(j);
//					b2 = temp;
					
					temp = batlist.get(i);
					batlist.set(i, batlist.get(j));
					batlist.set(j, temp);
				}				
			}				
		}		
		
//		for (int i = 0; i < humanB.length; i++) {		
//			if(humanB[i] != null) {
//				System.out.println((i + 1) + "위"
//						+ " 이름:" + humanB[i].getName() 
//						+ " 타율:" + ((BatterDto)humanB[i]).getHitAvg());
//			}
//		}		
		for (int i = 0; i < batlist.size(); i++) {
			BatterDto bat = batlist.get(i);
			System.out.println((i + 1) + "위"
					+ " 이름:" + bat.getName() 
					+ " 타율:" + bat.getHitAvg());
		}		
	}

	@Override
	public void pitchSort() {		
	/*	HumanDto humanP[] = new HumanDto[10];
		
		// 투수만으로 (배열)구성
		int count = 0;
		for (int i = 0; i < human.length; i++) {
			HumanDto h = human[i];
			if(h != null && h.getName().equals("") == false) {
				if(h instanceof PitcherDto) {
					humanP[count] = h;
					count++;
				}
			}
		}
		
//		for (HumanDto h : humanB) {
//			if(h != null) {
//				System.out.println(h.info());
//			}
//		}
		
		HumanDto temp;
		for (int i = 0; i < humanP.length - 1; i++) {
			for (int j = i + 1; j < humanP.length; j++) {
				
				if(humanP[i] != null && !humanP[i].getName().equals("") 
						&& humanP[j] != null && !humanP[j].getName().equals("")) {
					
					PitcherDto b1 = (PitcherDto)humanP[i];
					PitcherDto b2 = (PitcherDto)humanP[j];
					
					if(b1.getDefence() > b2.getDefence()) {	// 비교는 방어율로 한다
						temp = humanP[i];
						humanP[i] = humanP[j];
						humanP[j] = temp;
					}
				}
			}
		}
		
		for (int i = 0; i < humanP.length; i++) {		
			if(humanP[i] != null) {
				System.out.println((i + 1) + "위"
						+ " 이름:" + humanP[i].getName() 
						+ " 방어율:" + ((PitcherDto)humanP[i]).getDefence());
			}
		}	*/		
	}

	@Override
	public void save() {
		
		// 몇개의 데이터 수 파악
//		int count = 0;
//		for (HumanDto h : human) {
//			if(h != null && !h.getName().equals("")) {
//				count++;
//			}
//		}
		
//		if(count == 0) {
//			System.out.println("데이터가 없습니다");
//			return;
//		}
		if(Humanlist.size() == 0) {
			System.out.println("데이터가 없습니다");
			return;
		}
		
		// (string)배열설정
//		String saveDatas[] = new String[count];
		String saveDatas[] = new String[Humanlist.size()];
		
		// HumanDto -> String
//		int c = 0;
//		for (HumanDto h : human) {
//			if(h != null && !h.getName().equals("")) {
//				saveDatas[c] = h.toString();
//				c++;
//			}
//		}
		int c = 0;
		for (int i = 0; i < saveDatas.length; i++) {
			HumanDto h = Humanlist.get(i);
			saveDatas[c] = h.toString();
			c++;
		}
				
		// 저장
		dataProc.dataSave(saveDatas);
		
		System.out.println("저장되었습니다");
	}

	@Override
	public void load() {
		
		String datas[] = dataProc.dataLoad();		
//		for (String s : datas) {
//			System.out.println(s);
//		}
		
//		for (int i = 0; i < datas.length; i++) {
//			String data[] = datas[i].split("-");
//			
//			if(data[4].equals("투수")) {
//				human[i] = new PitcherDto(	Integer.parseInt(data[0]), 
//											data[1], 
//											Integer.parseInt(data[2]), 
//											Double.parseDouble(data[3]), 
//											data[4], 
//											Integer.parseInt(data[5]), 
//											Integer.parseInt(data[6]), 
//											Double.parseDouble(data[7]));				
//			}
//			else if(data[4].equals("타자")) {
//				human[i] = new BatterDto(	Integer.parseInt(data[0]), 
//											data[1], 
//											Integer.parseInt(data[2]), 
//											Double.parseDouble(data[3]), 
//											data[4], 
//											Integer.parseInt(data[5]), 
//											Integer.parseInt(data[6]), 
//											Double.parseDouble(data[7]));
//			}
//		}		
//		counter = datas.length;
		
		HumanDto dto = null;
		for (int i = 0; i < datas.length; i++) {
			String data[] = datas[i].split("-");	
			
			if(data[4].equals("투수")) {
				dto = new PitcherDto(	Integer.parseInt(data[0]), 
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											data[4], 
											Integer.parseInt(data[5]), 
											Integer.parseInt(data[6]), 
											Double.parseDouble(data[7]));				
			}
			else if(data[4].equals("타자")) {
				dto = new BatterDto(	Integer.parseInt(data[0]), 
											data[1], 
											Integer.parseInt(data[2]), 
											Double.parseDouble(data[3]), 
											data[4], 
											Integer.parseInt(data[5]), 
											Integer.parseInt(data[6]), 
											Double.parseDouble(data[7]));
			}			
			Humanlist.add(dto);		// list에 추가한다		
		}		
		
		System.out.println("데이터를 로드하였습니다");		
	}
	
	public int search(String name) {
		int index = -1;
//		for (int i = 0; i < human.length; i++) {
//			HumanDto dto = human[i];
//			if(name.equals(dto.getName())) {
//				index = i;
//				break;
//			}
//		}
		for (int i = 0; i < Humanlist.size(); i++) {
			HumanDto dto = Humanlist.get(i);
			if(name.equals(dto.getName())) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public List<Integer> searchAll(String name) {
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < Humanlist.size(); i++) {
			HumanDto dto = Humanlist.get(i);
			if(name.equals(dto.getName())) {
				list.add(i);
			}
		}
		return list;
	}
	

}









