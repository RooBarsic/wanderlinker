#include <bits/stdc++.h>

using namespace std;

string get_iso_code(string iso_code){
	string res = "";
	bool flag = false;
	for(int i = 0; i < iso_code.size(); i++){
		if(iso_code[i] == '"')
			flag = !flag;
		else if(flag) 
			res += iso_code[i];

	}
	return res;
}

string get_country_name(string country_name){

	string res = "";
	bool flag = false;
	int i = 0;
	while((i < country_name.size()) && (country_name[i] != ':')){
		i++;
	}
	for(; i < country_name.size(); i++){
		if(country_name[i] == '"')
			flag = !flag;
		else if((flag) && (country_name[i] != '\''))
			res += country_name[i];
		
	}
	return res;
}

void covid_parser(){
	
	string row;
	int k = 0;
	while(getline(cin, row)){
		//cout << " 1 :" << row << '\n';
		string country_name, slug_name, iso_code;
		cin >> row;
		getline(cin, country_name);
		//cout << " 2 :" << row << '\n';
		//cout << " 3 :" << country_name << '\n';
		cin >> row >> slug_name;
		//cout << " 4 :" << row << '\n';
		//cout << " 5 :" << slug_name << '\n';
		cin >> row >> iso_code;
		//cout << " 6 :" << row << '\n';
		//cout << " 7 :" << iso_code << '\n';
		cin >> row;
		getline(cin, row);
		//cout << " 8 :" << row << '\n';

		row = "INSERT INTO countries(code, name, population) values ( '" + get_iso_code(iso_code) + "', '" + get_country_name(country_name) + "', 10);" ;

		cout << row << '\n';

		//cout << " country_name = " << country_name << '\n'
		//	<< " slug_name = " << slug_name << '\n'
		//	<< " iso_code = " << iso_code << '\n';
		k++;

	}
	cout << " k = " << k << '\n';

}

bool check_matches(string s, string key){
	int s_size = s.size();
	int key_size = key.size();
	for(int i = 0; i < s_size; i++){
		bool flag = true;
		for(int j = 0; j < key_size; j++){
			if((i + j < s_size) && (s[i + j] != key[j])){
				flag = false;
				break;
			}
		}
		if(flag == true){
			return true;
		}
	}
	return false;
}

void pasre_data_2()
{
	vector<string> key_words;
	key_words.push_back("CLDR display name");
	key_words.push_back("Capital");
	key_words.push_back("ISO3166-1-Alpha-2");
	key_words.push_back("ISO3166-1-Alpha-3");
	key_words.push_back("UNTERM English Formal");
	key_words.push_back("UNTERM English Short");
	key_words.push_back("official_name_en");
	key_words.push_back("ISO4217-currency_name");
	//key_words.push_back();
	//key_words.push_back();
	//key_words.push_back();
	string row;
	
	/*
	int k = 0;
	while(getline(cin, row)){
		for(int i = 0; i < key_words.size(); i++){
			if(check_matches(row, key_words[i])){
				//if(check_matches(row, "null") == false)
					cout << row << '\n';
		
				k++;
				if(k == key_words.size()){
					cout << '\n';
					k = 0;
				}
		
				break;
			}
		}
	}

	return ;
	//*/
/*
		"CLDR display name":"Afghanistan",
        "Capital":"Kabul",
        "ISO3166-1-Alpha-2":"AF",
        "ISO3166-1-Alpha-3":"AFG",
        "ISO4217-currency_name":"Afghani",
        "UNTERM English Formal":"the Islamic Republic of Afghanistan",
        "UNTERM English Short":"Afghanistan",
        "official_name_en":"Afghanistan"

	while(getline(cin, row)){
		string display_name = row;
		string capital;
		string iso_2;
		string iso_3;
		string currency_name;
		string uterm_full_format;
		string uterm_short_format;
		string official_name_en;

		getline(cin, capital);
		getline(cin, iso_2);
		getline(cin, iso_3);
		getline(cin, currency_name);
		getline(cin, uterm_full_format);
		getline(cin, uterm_short_format);
		getline(cin, official_name_en);

		string name_2 = "<------------------------------ ERROROR ----------------------------------->>>>>>>>>>>>>>>>>>>>>";
		if(!check_matches(display_name, "null")){
			name_2 = display_name;
		} 
		else if(!check_matches(uterm_short_format, "null")){
			name_2 = uterm_short_format;
		} 
		else if(!check_matches(official_name_en, "null")){
			name_2 = official_name_en;
		} 
		else {
			cout << "<------------------------------ ERROROR ----------------------------------->>>>>>>>>>>>>>>>>>>>> \n";
			return;
		}

		if(check_matches(uterm_full_format, "null")){
			uterm_full_format = name_2;
		}
		name_2 = get_country_name(name_2);
		uterm_full_format = get_country_name(uterm_full_format);
		capital = get_country_name(capital);
		iso_2 = get_country_name(iso_2);
		iso_3 = get_country_name(iso_3);
		currency_name = get_country_name(currency_name);

		cout << "INSERT INTO countries(name, official_name, capital, ISO2, ISO2, currency_name) values ('"
			<< name_2 << "', '"
			<< uterm_full_format << "', '"
			<< capital << "', '"
			<< iso_2 << "', '"
			<< iso_3 << "', '"
			<< currency_name << "');"
			<< '\n';

		getline(cin, row);
	}
	//*/


	while(getline(cin, row)){
		string name_2 = row;
		string capital;
		string iso_2;
		string iso_3;
		string currency_name;
		string uterm_full_format;
	
		getline(cin, uterm_full_format);
		getline(cin, capital);
		getline(cin, iso_2);
		getline(cin, iso_3);
		getline(cin, currency_name);
		
		name_2 = get_country_name(name_2);
		uterm_full_format = get_country_name(uterm_full_format);
		capital = get_country_name(capital);
		iso_2 = get_country_name(iso_2);
		iso_3 = get_country_name(iso_3);
		currency_name = get_country_name(currency_name);

		cout << "INSERT INTO countries(name, officialName, capital, iso2, iso3, currencyName, totalConfirmed, totalDeaths, totalRecovered, totalActive, lastUpdate) values ('"
			<< name_2 << "', '"
			<< uterm_full_format << "', '"
			<< capital << "', '"
			<< iso_2 << "', '"
			<< iso_3 << "', '"
			<< currency_name << "', "
			<< "0, 0, 0, 0, '2020-01-01T00:00:00Z');"
			<< '\n';

		getline(cin, row);
	}

	return;


	return;

//INSERT INTO countries(name, official_name, capital, ISO2, ISO2, currency_name) values ('Tajikistan', 'Republic of Tajikistan', 'Dushanbe', 'TJK', 'TJ', "Somoni");


	/*
	cout << " country_name : country_capital : iso_2 : iso_3 \n";
	while(getline(cin, row)){
		string country_name = row;
		string country_capital, iso_2, iso_3;
		getline(cin, country_capital);
		getline(cin, iso_2);
		getline(cin, iso_3);
		//cin >> country_capital >> iso_2 >> iso_3;

		cout << "INSERT INTO countries(name, capital, ISO2, ISO2) values ('" 
			<< country_name << "', '"
			<< country_capital << "', '"
			<< iso_2 << "', '"
			<< iso_3 << "');" 
			<< '\n';
	}
	//*/
}

int get_num(string country_name){
	int i = 0;
	while((i < country_name.size()) && (country_name[i] != ':')){
		i++;
	}
	int res = 0;
	for(; i < country_name.size(); i++){
		if(('0' <= country_name[i]) && (country_name[i] <= '9')){
			res = (res * 10) + (int(country_name[i]) - int('0')) ;
		}
		
	}
	return res;	
}

void update_covid_data(){
	string row;
	while(getline(cin, row)){
		
			getline(cin, row);		
		string iso_2;
		getline(cin, iso_2);
			getline(cin, row);
			getline(cin, row);
		string total_confirmed;
		getline(cin, total_confirmed);
			getline(cin, row);	
		string total_death;
		getline(cin, total_death);
			getline(cin, row);
		string total_recovered;
		getline(cin, total_recovered);
		string date;
		getline(cin, date);
			getline(cin, row);

		iso_2 = get_country_name(iso_2);
		int i_total_conf = get_num(total_confirmed);
		int i_total_death = get_num(total_death);
		int i_total_recovered = get_num(total_recovered);
		int i_active = i_total_conf - i_total_recovered - i_total_death;
		date = get_country_name(date);

		cout << "UPDATE countries SET "
			<< " totalConfirmed = " << i_total_conf << ", "
			<< " totalDeaths = " << i_total_death << ", "
			<< " totalRecovered = " << i_total_recovered << ", "
			<< " totalActive = " << i_active << ", "
			<< " lastUpdate = '" << date << "' "
			<< " WHERE iso2 = '" << iso_2 << "';"
			<< '\n';

	}
}

//UPDATE countries SET totalConfirmed = 5, totalDeaths = 3, totalRecovered = 1 totalActive = 4 lastUpdate = 'sdf' WHERE iso2 = '';


int main(){
	freopen("data_3.txt", "r", stdin);
	freopen("result.txt", "w", stdout);

	update_covid_data();
}

/*




"CLDR display name"
"Capital"
"ISO3166-1-Alpha-2"
"ISO3166-1-Alpha-3"



*/















