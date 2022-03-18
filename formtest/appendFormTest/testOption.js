// ��¥<option>�ֱ�
// ���� ����ؼ� ����
// 1900���� 
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

// �Լ�ȣ��
lastday();
// Javascript�Լ�
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

// �Լ�ȣ��
education();
// �з�<option>�ֱ�
// ���߿� Education �迭�� DB���� �޾ƿ� �з����̺� �÷��� �������
function education(){
    const Education = ["�����ϼ���","�ʵ��б�","���б�","����б�","�������б�","�ι����б�"];
    
    for(let i=0; i<Education.length; i++){
        document.getElementById('education').options[i] = new Option(Education[i],Education[i]);
    }
}

// �Լ�ȣ��
childnum();
// �ڳ��<option>�ֱ�
// ���߿� childnum �迭�� DB���� �޾ƿ� �ڳ�����̺� �÷��� �������
function childnum(){
	const childnum =["����","����",1,2,3,4,5,6,7,8];

	for(let i=0; i<childnum.length; i++){
        document.getElementById('childnum').options[i] = new Option(childnum[i],childnum[i]);
    }
}

// �Լ�ȣ��
jobs();
// �ڳ��<option>�ֱ�
// ���߿� childnum �迭�� DB���� �޾ƿ� �ڳ�����̺� �÷��� �������
function jobs(){
	const jobs =["�����ϼ���","�л�","������","�ֺ�","������"];

	for(let i=0; i<jobs.length; i++){
        document.getElementById('jobs').options[i] = new Option(jobs[i],jobs[i]);
    }
}