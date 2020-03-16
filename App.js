import React, {Component} from 'react';
import {View, Button, NativeModules, StyleSheet} from 'react-native';
import EmptyView from './ViewNative';

export default class App extends Component {
  render() {
    return (
      <View>
        <Button
          title="Press me"
          onPress={() => {
            NativeModules.BasicModules.NavigatoNative();
          }}
        />
        <EmptyView style={style.square} />
      </View>
    );
  }
}

const style = StyleSheet.create({
  square: {
    height: 100,
    width: 100,
  },
});
