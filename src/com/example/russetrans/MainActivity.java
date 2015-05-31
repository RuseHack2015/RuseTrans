package com.example.russetrans;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	// Google Map
	private GoogleMap googleMap;
	int i=0,j=0;
	
	// Polyline poly ;
	private static final LatLng Russe = new LatLng(43.84601834, 25.96027225);
	private static final LatLng BUS_STOP_KAT = new LatLng(43.85389478,
			26.00538433);
	private static final LatLng BUS_STOP_AVKO = new LatLng(43.85370137,
			26.0032707);
	private static final LatLng BUS_STOP_MOLL = new LatLng(43.85332227,
			26.00018084);
	private static final LatLng BUS_STOP_PODSTANCIQ = new LatLng(43.85204569,
			25.99074483);
	private static final LatLng BUS_STOP_OLIMP = new LatLng(43.85048282,
			25.97870708);
	private static final LatLng BUS_STOP_PETAR_KARAMINCHEV = new LatLng(
			43.84932998, 25.97353041);
	private static final LatLng BUS_STOP_QLTA = new LatLng(43.84712869,
			25.96594781);
	private static final LatLng BUS_STOP_SBA = new LatLng(43.84467584,
			25.95237583);
	private static final LatLng BUS_STOP_MG = new LatLng(43.84263688,
			25.9484008);
	private static final LatLng BUS_STOP_MARIELA_SONI = new LatLng(43.8377578,
			25.94910353);
	private static final LatLng BUS_STOP_SENT_UAN = new LatLng(43.83452291,
			25.94230145);
	private static final LatLng BUS_STOP_FAZAN = new LatLng(43.83121433,
			25.93896747);
	private static final LatLng BUS_STOP_DUNAVSKA_KOPRINA = new LatLng(
			43.82887692, 25.93727231);
	private static final LatLng BUS_STOP_POJARNA = new LatLng(43.82475915,
			25.93411803);
	private static final LatLng BUS_STOP_DAP = new LatLng(43.82084236,
			25.93199372);

	private static final LatLng BUS_STOP_DRUJBA_3_OBR = new LatLng(43.82513843,
			25.96817872);
	private static final LatLng BUS_STOP_DRUJBA_3_10_BL = new LatLng(
			43.82741215, 25.97222944);
	private static final LatLng BUS_STOP_DRUJBA_3_CBA = new LatLng(43.8293239,
			25.97046064);
	private static final LatLng BUS_STOP_CHARODEIKA_1 = new LatLng(43.83231949,
			25.9771714);
	private static final LatLng BUS_STOP_CHARODEIKA_2 = new LatLng(43.83266255,
			25.97360258);
	private static final LatLng BUS_STOP_PECHATNI_PLATKI = new LatLng(
			43.83320107, 25.96976534);
	private static final LatLng BUS_STOP_PAZARA = new LatLng(43.84091982,
			25.96058366);
	private static final LatLng BUS_STOP_AVTOGARA_IZTOK = new LatLng(
			43.85515584, 25.99733233);
	MarkerOptions options = new MarkerOptions();
	Polyline poly;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		try {
			// Loading map
			initilizeMap();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * function to load map. If map is not created it will create it for you
	 * */
public void initilizeMap() {
		if (googleMap == null) {
			//
			googleMap = ((MapFragment) getFragmentManager().findFragmentById(
					R.id.map)).getMap();

			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			googleMap.setMyLocationEnabled(true);
			googleMap.getUiSettings().setZoomControlsEnabled(true);
			googleMap.getUiSettings().setZoomGesturesEnabled(true);

			
			options.position(BUS_STOP_KAT);
			options.position(BUS_STOP_AVKO);
			options.position(BUS_STOP_MOLL);
			options.position(BUS_STOP_PODSTANCIQ);
			options.position(BUS_STOP_OLIMP);
			options.position(BUS_STOP_PETAR_KARAMINCHEV);
			options.position(BUS_STOP_QLTA);
			options.position(BUS_STOP_SBA);
			options.position(BUS_STOP_MG);
			options.position(BUS_STOP_MARIELA_SONI);
			options.position(BUS_STOP_SENT_UAN);
			options.position(BUS_STOP_FAZAN);
			options.position(BUS_STOP_DUNAVSKA_KOPRINA);
			options.position(BUS_STOP_POJARNA);
			options.position(BUS_STOP_DAP);
			options.position(BUS_STOP_DRUJBA_3_OBR);
			options.position(BUS_STOP_DRUJBA_3_10_BL);
			options.position(BUS_STOP_DRUJBA_3_CBA);
			options.position(BUS_STOP_CHARODEIKA_1);
			options.position(BUS_STOP_CHARODEIKA_2);
			options.position(BUS_STOP_PECHATNI_PLATKI);
			options.position(BUS_STOP_PAZARA);
			options.position(BUS_STOP_AVTOGARA_IZTOK);
			googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Russe, 12));
			addMarkers();

			googleMap
					.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {

						@Override
						public void onInfoWindowClick(Marker arg0) {
							showDialog();

							// Intent in=new
							// Intent(MainActivity.this,Info.class);
							// ClickPoint cp=new ClickPoint();
							// FragmentManager manager = null;
							// cp.show(manager, "alert");
							// startActivity(in);
						}

						@SuppressLint("SimpleDateFormat")
						public void showDialog() {
							// TODO Auto-generated method stub
							AlertDialog.Builder builder = new AlertDialog.Builder(
									MainActivity.this);
							
							Calendar c = Calendar.getInstance();
							 SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss"); 
						        SimpleDateFormat start = new  SimpleDateFormat("05:10:00");
						        String formattedDate = df.format(c.getTime());
						        String forDate = start.format(c.getTime());

							final CharSequence[] choiceList = { "Линия №2 "+ " в "+ formattedDate , 
									"9", 
									"13",
									"21", 
									"24", 
									"25", 
									"27", 
									"29" };

							int selected = -1;

							builder.setTitle("Избери линия");
							builder.setSingleChoiceItems(choiceList, selected,
									new DialogInterface.OnClickListener()

									{

										@Override
										public void onClick(
												DialogInterface dialog,
												int which) {
											// TODO Auto-generated method stub
											String num = choiceList[which]
													.toString();

											if (choiceList[which] == choiceList[0]) {
												drawPath_2();
												Toast.makeText(
														getApplicationContext(),
														"Избрахте линия № "
																+ num,
														Toast.LENGTH_SHORT)
														.show();
											}
											if (choiceList[which] == choiceList[1]) {
												drawPath_9();
												Toast.makeText(
														getApplicationContext(),
														"Избрахте линия № "
																+ num,
														Toast.LENGTH_SHORT)
														.show();

											}
											if (choiceList[which] == choiceList[2]) {
												drawPath_13();
												Toast.makeText(
														getApplicationContext(),
														"Избрахте линия № "
																+ num,
														Toast.LENGTH_SHORT)
														.show();

											}
											if (choiceList[which] == choiceList[3]) {
												drawPath_21();
												Toast.makeText(
														getApplicationContext(),
														"Избрахте линия № "
																+ num,
														Toast.LENGTH_SHORT)
														.show();
											}
											if (choiceList[which] == choiceList[3]) {
												drawPath_24();
												Toast.makeText(
														getApplicationContext(),
														"Избрахте линия № "
																+ num,
														Toast.LENGTH_SHORT)
														.show();
											}
											if (choiceList[which] == choiceList[3]) {
												drawPath_25();
												Toast.makeText(
														getApplicationContext(),
														"Избрахте линия № "
																+ num,
														Toast.LENGTH_SHORT)
														.show();
											}
											if (choiceList[which] == choiceList[3]) {
												drawPath_27();
												Toast.makeText(
														getApplicationContext(),
														"Избрахте линия № "
																+ num,
														Toast.LENGTH_SHORT)
														.show();
											}
											if (choiceList[which] == choiceList[3]) {
												drawPath_29();
												Toast.makeText(
														getApplicationContext(),
														"Избрахте линия № "
																+ num,
														Toast.LENGTH_SHORT)
														.show();
											}
											dialog.dismiss();// Dismiss this
																// dialog,
																// removing it
											// from the screen.
										}

										private void drawPath_29() {
											// TODO Auto-generated method stub
											
										}

										private void drawPath_27() {
											// TODO Auto-generated method stub
											
										}

										private void drawPath_25() {
											// TODO Auto-generated method stub
											
										}

										private void drawPath_24() {
											// TODO Auto-generated method stub
											
										}

										private void drawPath_9() {
											// TODO Auto-generated method stub
											
										}

										private void drawPath_21() {
											// TODO Auto-generated method stub
										googleMap.addPolyline(new PolylineOptions()
															.width(2)
															.color(Color.BLUE)
															.geodesic(true)

															.add(BUS_STOP_CHARODEIKA_1)
															.add(BUS_STOP_CHARODEIKA_2)
															.add(BUS_STOP_PECHATNI_PLATKI)
															.add(BUS_STOP_PAZARA)
															.add(BUS_STOP_QLTA)
															.add(BUS_STOP_PETAR_KARAMINCHEV)
															.add(BUS_STOP_OLIMP)
															.add(BUS_STOP_PODSTANCIQ)
															.add(BUS_STOP_MOLL)
															.add(BUS_STOP_AVKO));
											
										}

										private void drawPath_13() {
											// TODO Auto-generated method stub
											
											googleMap
													.addPolyline(new PolylineOptions()
															.width(2)
															.color(Color.GREEN)
															.geodesic(true)
															.add(BUS_STOP_DRUJBA_3_OBR)
															.add(BUS_STOP_DRUJBA_3_10_BL)
															.add(BUS_STOP_DRUJBA_3_CBA)
															.add(BUS_STOP_PECHATNI_PLATKI)
															.add(BUS_STOP_PAZARA)
															.add(BUS_STOP_QLTA)
															.add(BUS_STOP_PETAR_KARAMINCHEV)
															.add(BUS_STOP_OLIMP)
															.add(BUS_STOP_PODSTANCIQ)
															.add(BUS_STOP_MOLL)
															.add(BUS_STOP_AVKO)
															.add(BUS_STOP_AVTOGARA_IZTOK)

													);
										}

										public void drawPath_2() {
											// TODO Auto-generated method stub
											
											for( j=0;j<15;j++){
											poly = googleMap
													.addPolyline(new PolylineOptions()
															.width(2)
															.color(Color.RED)
															.geodesic(true)
															
															.add(BUS_STOP_KAT)
															.add(BUS_STOP_AVKO)
															.add(BUS_STOP_MOLL)
															.add(BUS_STOP_PODSTANCIQ)
															.add(BUS_STOP_OLIMP)
															.add(BUS_STOP_PETAR_KARAMINCHEV)
															.add(BUS_STOP_QLTA)
															.add(BUS_STOP_SBA)
															.add(BUS_STOP_MG)
															.add(BUS_STOP_MARIELA_SONI)
															.add(BUS_STOP_SENT_UAN)
															.add(BUS_STOP_FAZAN)
															.add(BUS_STOP_DUNAVSKA_KOPRINA)
															.add(BUS_STOP_POJARNA)
															.add(BUS_STOP_DAP));
											}
											
											
											
										}
										
									});

							AlertDialog alert = builder.create();
							alert.show();

						}

					});

			
		}

		// check if map is created successfully or not
		if (googleMap == null) {
			Toast.makeText(getApplicationContext(),
					"Sorry! Unable to create maps", Toast.LENGTH_SHORT).show();
		}
	}

	private void addMarkers() {
		if (googleMap != null) {

			// Date d=c.getTime();
			// String hour=d.toString();
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_KAT)
							.title("КАТ")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_AVKO)
							.title("Авко")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_MOLL)
							.title("Мол")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_PODSTANCIQ)
							.title("Подстанция")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_OLIMP)
							.title("Олимп")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_PETAR_KARAMINCHEV)
							.title("Петър Караминчев")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_QLTA)
							.title("Ялта")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_SBA)
							.title("СБА")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_MG)
							.title("МГ")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_MARIELA_SONI)
							.title("Мариела Сони")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_SENT_UAN)
							.title("Сент Уан")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_FAZAN)
							.title("Фазан")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_DUNAVSKA_KOPRINA)
							.title("Дунавска Коприна")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_POJARNA)
							.title("Пожарна")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_DAP)
							.title("ДАП")
							.snippet("Линия № 2, 13, 21")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_DRUJBA_3_OBR)
							.title("Дружба 3 обръщало")
							.snippet("Линия № 13, 24, 25, 27")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_DRUJBA_3_10_BL)
							.title("Дружба 3, 10 блок")
							.snippet("Линия № 13, 24, 25, 27")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_DRUJBA_3_CBA)
							.title("Дружба 3 CBA")
							.snippet("Линия № 13, 24, 25, 27")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_CHARODEIKA_1)
							.title("Чародейка 1")
							.snippet("Линия № 9, 21, 29")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_CHARODEIKA_2)
							.title("Чародейка 2")
							.snippet("Линия № 9, 21, 29")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_PECHATNI_PLATKI)
							.title("Печатни платки")
							.snippet("Линия № 9, 13, 21, 24, 25, 27, 29")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));
			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_PAZARA)
							.title("Пазара")
							.snippet("Линия № 9, 13, 21, 24, 27, 29")
							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

			googleMap
					.addMarker(new MarkerOptions()
							.position(BUS_STOP_AVTOGARA_IZTOK)
							.title("Автогара Изток")
							.snippet("Линия № 13, 21")

							.icon(BitmapDescriptorFactory
									.fromResource(R.drawable.mark)));

		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		initilizeMap();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent info = new Intent(this, Info.class);
			startActivity(info);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
