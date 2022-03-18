// 날짜<option>넣기
// 윤달 계산해서 넣음
// 1900시작 
let start_year="1900";
let today = new Date();
let today_year= today.getFullYear();
let index=0;

for(let y=start_year; y<=today_year; y++){
    document.getElementById('select_year').options[index] = new Option(y, y); index++; 
}

index=0;

for(let m=1; m<=12; m++){
    document.getElementById('select_month').options[index] = new Option(m, m); index++;
}

// 함수호출
lastday();
// Javascript함수
function lastday(){

    let Year=document.getElementById('select_year').value;
    let Month=document.getElementById('select_month').value;
    let day=new Date(new Date(Year,Month,1)-86400000).getDate();

    let dayindex_len=document.getElementById('select_day').length;

    if(day>dayindex_len){
    	for(let i=(dayindex_len+1); i<=day; i++){
        	document.getElementById('select_day').options[i-1] = new Option(i, i);
        }
    } else if(day<dayindex_len){ 
        for(let i=dayindex_len; i>=day; i--){ 
            document.getElementById('select_day').options[i]=null; 
        } 
    }
}

// 함수호출
education();
// 학력<option>넣기
// 나중에 Education 배열에 DB에서 받아온 학력테이블 컬럼값 넣으면됨
function education(){
    const Education = ["선택하세요","초등학교","중학교","고등학교","전문대학교","인문대학교"];
    
    for(let i=0; i<Education.length; i++){
        document.getElementById('education').options[i] = new Option(Education[i],Education[i]);
    }
}

// 함수호출
childnum();
// 자녀수<option>넣기
// 나중에 childnum 배열에 DB에서 받아온 자녀수테이블 컬럼값 넣으면됨
function childnum(){
	const childnum =["선택","없음",1,2,3,4,5,6,7,8];

	for(let i=0; i<childnum.length; i++){
        document.getElementById('childnum').options[i] = new Option(childnum[i],childnum[i]);
    }
}

// 함수호출
jobs();
// 자녀수<option>넣기
// 나중에 childnum 배열에 DB에서 받아온 자녀수테이블 컬럼값 넣으면됨
function jobs(){
	const jobs =["선택하세요","학생","직장인","주부","공무원"];

	for(let i=0; i<jobs.length; i++){
        document.getElementById('jobs').options[i] = new Option(jobs[i],jobs[i]);
    }
}